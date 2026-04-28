<div align="center">

<img src="https://skillicons.dev/icons?i=py,numpy,scipy" height="90"/>

# 🔷 gyro-sync

### real-time 3d smartphone orientation mirroring via udp

---

![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/status-active-success?style=for-the-badge)

</div>

---

# 🚀 features

- ⚡ **zero latency udp streaming**
- 🧩 **quaternion-based rotation** *(no gimbal lock)*
- 🎯 **instant calibration system**
- 📦 **lightweight python-only pipeline**

---

# 🛠 tech stack

| Component | Role |
|----------|------|
| pygame | rendering engine |
| numpy | matrix math |
| scipy | quaternion rotation system |

---

# 📐 math core

Projection formula used in rendering:

```math
factor = \frac{z_{dist}}{z_{dist} + point_z}
pipeline:
gyro sensor → quaternion → UDP stream → PC receiver → 3D projection → rendering
