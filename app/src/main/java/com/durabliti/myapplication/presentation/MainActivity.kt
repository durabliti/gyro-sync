package com.durabliti.myapplication.presentation

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.durabliti.myapplication.presentation.theme.MyApplicationTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress

class MainActivity : ComponentActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var rotationVectorSensor: Sensor? = null
    
    private var ipAddress by mutableStateOf("192.168.3.55") 
    private var isSending by mutableStateOf(false)
    private var socket: DatagramSocket? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        rotationVectorSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)

        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding).fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text("3D Sensor Controller", style = MaterialTheme.typography.headlineMedium)
                        Spacer(modifier = Modifier.height(20.dp))
                        
                        OutlinedTextField(
                            value = ipAddress,
                            onValueChange = { ipAddress = it },
                            label = { Text("Computer IP") },
                            modifier = Modifier.padding(horizontal = 32.dp).fillMaxWidth()
                        )
                        
                        Spacer(modifier = Modifier.height(20.dp))
                        
                        Button(
                            onClick = {
                                isSending = !isSending
                                if (isSending) startSending() else stopSending()
                            },
                            modifier = Modifier.height(60.dp).fillMaxWidth(0.7f)
                        ) {
                            Text(if (isSending) "STOP STREAMING" else "START STREAMING")
                        }
                    }
                }
            }
        }
    }

    private fun startSending() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                if (socket == null || socket!!.isClosed) {
                    socket = DatagramSocket()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        rotationVectorSensor?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_GAME)
        }
    }

    private fun stopSending() {
        sensorManager.unregisterListener(this)
        lifecycleScope.launch(Dispatchers.IO) {
            socket?.close()
            socket = null
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (isSending && event?.sensor?.type == Sensor.TYPE_ROTATION_VECTOR) {
            // Android Rotation Vector provides quaternion components
            val q = FloatArray(4)
            SensorManager.getQuaternionFromVector(q, event.values)
            
            // Send: w, x, y, z
            val message = "${q[0]},${q[1]},${q[2]},${q[3]}"
            
            lifecycleScope.launch(Dispatchers.IO) {
                try {
                    val data = message.toByteArray()
                    val address = InetAddress.getByName(ipAddress)
                    val packet = DatagramPacket(data, data.size, address, 5005)
                    socket?.send(packet)
                } catch (e: Exception) {
                    // Fail silently in background
                }
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}

    override fun onDestroy() {
        super.onDestroy()
        stopSending()
    }
}
