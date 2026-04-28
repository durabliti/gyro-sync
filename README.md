<div align="center">

<!-- NEON GRADIENT TITLE (SVG) -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f0c29,50:302b63,100:24243e&height=140&section=header&text=gyro-sync&fontSize=40&fontColor=ffffff&animation=fadeIn" />

### 🌐 real-time 3D smartphone orientation mirroring via UDP

---

![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![SciPy](https://img.shields.io/badge/scipy-0A66C2?style=for-the-badge)
![NumPy](https://img.shields.io/badge/numpy-013243?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-00ff88?style=for-the-badge)
![Status](https://img.shields.io/badge/status-active-7CFC00?style=for-the-badge)

---

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:00f5ff,100:7c4dff&height=2"/>

</div>

---

# ⚡ CORE FEATURES

```diff
+ ⚡ ultra-low latency UDP streaming
+ 🧠 quaternion-based rotation (no gimbal lock)
+ 🎯 instant calibration system
+ 📦 pure Python architecture (no engine dependency)
🧬 SYSTEM PIPELINE
📱 Gyroscope Sensor
        ↓
🧮 Quaternion Conversion
        ↓
📡 UDP Transmission
        ↓
💻 PC Receiver
        ↓
📐 3D Projection Engine
        ↓
🖥 Real-time Rendering
🛠 TECH STACK
Layer	Tech	Role
🎮 Rendering	pygame	wireframe + visuals
🧮 Math	numpy	matrix computation
🧠 Rotation	scipy	quaternion engine
📡 Network	UDP sockets	real-time sync
📐 MATHEMATICAL CORE
Perspective projection:
factor=
z
dist
	​

+point
z
	​

z
dist
	​

	​

Quaternion stability layer:
prevents gimbal lock
ensures smooth 360° rotation
maintains orientation integrity
🎮 CONTROLS
Key	Action
C	recalibrate orientation
ESC	exit application
🌌 SYSTEM DESIGN GOAL

Real-time spatial synchronization between mobile gyroscope input and PC 3D visualization with minimal latency and maximal rotational accuracy.

🔥 PERFORMANCE NOTES
🚀 UDP = near-zero overhead transport
⚙️ numpy vectorization = fast math
🧠 quaternion math = stable rotation
🖥 lightweight renderer = smooth FPS
🌈 FINAL STATEMENT

Built for experiments in real-time spatial computing, motion tracking, and 3D visualization systems.
