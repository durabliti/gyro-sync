<!-- HERO BANNER -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f0c29,50:302b63,100:00c6ff&height=140&section=header&text=gyro-sync&fontSize=42&fontColor=ffffff" />

<div align="center">

### 🌐 real-time 3D smartphone orientation mirroring via UDP

---

![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python)
![NumPy](https://img.shields.io/badge/numpy-013243?style=for-the-badge)
![SciPy](https://img.shields.io/badge/scipy-0A66C2?style=for-the-badge)
![UDP](https://img.shields.io/badge/network-UDP-00ffcc?style=for-the-badge)

</div>

---

# ⚡ SYSTEM OVERVIEW (VISUAL FLOW)

``` id="x91m2a"
📱 Smartphone Gyroscope
        ↓
🧠 Quaternion Conversion
        ↓
📡 UDP Stream (low latency)
        ↓
💻 PC Receiver
        ↓
📐 3D Projection Engine
        ↓
🖥 Real-time Wireframe Render
🚀 FEATURES (VISUAL CARDS)
⚡ ZERO LATENCY
→ real-time UDP streaming pipeline

🧩 STABLE ROTATION
→ quaternion math (no gimbal lock)

🎯 INSTANT CALIBRATION
→ one key reset orientation

📦 LIGHTWEIGHT
→ pure Python stack, no engine
🧮 MATHEMATICAL CORE
📐 projection model
factor = z_dist / (z_dist + point_z)
🧠 meaning:
closer objects → bigger
farther objects → smaller
simulates real camera perspective
🧱 ARCHITECTURE MAP
flowchart TD
A[Phone Gyroscope] --> B[Quaternion Transform]
B --> C[UDP Network Stream]
C --> D[PC Receiver]
D --> E[3D Engine]
E --> F[Wireframe Render]
🎮 CONTROLS
Key	Action
C	recalibrate orientation
ESC	exit app
🌌 PROJECT VIBE

real-time spatial sync system between mobile motion sensors and desktop 3D visualization engine.

🔥 PERFORMANCE
⚡ UDP = near zero overhead
🧠 quaternion math = stable rotation
🚀 numpy = vectorized speed
🖥 pygame = lightweight rendering
<!-- FOOTER WAVE --> <img src="https://capsule-render.vercel.app/api?type=waving&color=0:00c6ff,50:7c4dff,100:0f0c29&height=120&section=footer"/> ```
