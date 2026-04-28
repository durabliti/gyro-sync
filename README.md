<div align="center">
  <img src="https://skillicons.dev/icons?i=py,math" height="100" />
  <h1>gyro-sync</h1>
  <p><b>real-time 3d smartphone orientation mirroring via udp</b></p>

  <p>
    <img src="https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54" />
    <img src="https://img.shields.io/badge/license-MIT-green?style=for-the-badge" />
    <img src="https://img.shields.io/badge/status-active-success?style=for-the-badge" />
  </p>
</div>

---

### 🚀 features

* ⚡ **zero latency**: high-speed udp communication for instant feedback.
* 🧩 **quaternion logic**: avoids gimbal lock for perfect 360° rotation.
* 🎯 **one-tap calibration**: instant reset to center position.
* 📦 **standalone**: no heavy engines, just pure python and math.

---

### 🛠 tech stack

<p align="left">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=py,numpy,linux,windows" />
    <img width="747" height="786" alt="Image" src="https://github.com/user-attachments/assets/4dcc32cc-dbdb-437c-b90b-fe5d20194dab" />
  </a>
</p>

| library | role |
| :--- | :--- |
| **pygame** | window rendering & wireframe engine |
| **scipy** | advanced rotation & quaternion transformations |
| **numpy** | high-performance matrix operations |

---

### 📦 installation & setup

1. **clone and install dependencies**
```bash
git clone [https://github.com/your-username/gyro-sync.git](https://github.com/your-username/gyro-sync.git)
cd gyro-sync
pip install pygame numpy scipy
launch the pc receiverBashpython main.py
configure mobile appprotocol: UDPtarget: your-pc-ip:5005format: x,y,z,w (quaternions)🎮 controls[!TIP]for the best experience, hold your phone steady facing the screen before calibrating.key [C]: recalibrate orientation (set current position as "front").key [ESC]: close the application.📐 mathematical approachthe script uses a perspective projection matrix to transform 3d vertices into 2d screen coordinates:$$factor = \frac{z_{dist}}{z_{dist} + point_z}$$the model consists of 8 vertices defining a rectangular cuboid.the "top" (camera side) is highlighted with a separate red polygon for orientation clarity.all rotations are processed through the scipy.spatial.transform.Rotation class to ensure stability.
