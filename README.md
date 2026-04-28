<div align="center">

<div style="
  border: 2px solid #4da3ff;
  border-radius: 18px;
  padding: 25px;
  max-width: 900px;
  margin: auto;
  background: linear-gradient(145deg, #0b0f1a, #111a2e);
  box-shadow: 0 0 25px rgba(77,163,255,0.25);
  position: relative;
  overflow: hidden;
">

<!-- rainbow corners glow -->
<div style="
  position:absolute;
  top:-50px; left:-50px;
  width:120px; height:120px;
  background: radial-gradient(circle, red, orange, yellow, green, cyan, blue, violet);
  filter: blur(25px);
  opacity:0.6;
"></div>

<div style="
  position:absolute;
  bottom:-50px; right:-50px;
  width:120px; height:120px;
  background: radial-gradient(circle, cyan, blue, violet, red);
  filter: blur(25px);
  opacity:0.6;
"></div>

<img src="https://skillicons.dev/icons?i=py,numpy,scipy" height="90"/>

<h1 style="
  background: linear-gradient(90deg, #4da3ff, #7c4dff, #00ffe1);
  -webkit-background-clip: text;
  color: transparent;
  font-size: 42px;
  margin: 10px 0;
">
gyro-sync
</h1>

<p style="color:#cbd5e1; font-size:16px;">
real-time 3d smartphone orientation mirroring via udp
</p>

<img src="https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54"/>
<img src="https://img.shields.io/badge/license-MIT-green?style=for-the-badge"/>
<img src="https://img.shields.io/badge/status-active-success?style=for-the-badge"/>

</div>
</div>

---

## 🚀 features
- ⚡ zero latency udp streaming
- 🧩 quaternion-based rotation (no gimbal lock)
- 🎯 instant calibration system
- 📦 lightweight python-only pipeline

---

## 🛠 tech stack
- pygame — rendering engine  
- numpy — matrix math  
- scipy — quaternion rotation system  

---

## 📐 math core
\[
factor = \frac{z_{dist}}{z_{dist} + point_z}
\]

3D → 2D projection + quaternion rotation pipeline.

---
