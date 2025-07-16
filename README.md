# java-feedback-form
A user-friendly Java Swing-based application that allows users to register, log in, and submit feedback through a graphical interface. The system uses Apache Derby (Java DB) in embedded mode to store user and feedback data locally. Designed using NetBeans GUI Builder for seamless form navigation and intuitive user interaction.

---
## 🚀 How to Run This Project

### ✅ Requirements

- Java JDK 8 or higher
- NetBeans IDE (recommended)
- Java DB (Apache Derby) — usually comes with NetBeans

---

### 🧭 Steps to Run:

1. **Clone or download** the project folder.

2. **Open the project in NetBeans IDE**.

3. **Database Setup:**
   - No manual DB setup required. Database is embedded.
   - Database files are located in `db/form_db/`.
   - JDBC connection URL used:
     ```
     jdbc:derby=./db/form_db;create=true
     ```

4. ✅ **Run the project by executing `entry_frame.java`**
   - This is the main starting point of the application.
   - Other forms (`login_frame`, `signup_frame`, `feedback_frame`) are controlled from this file.

---

## 🗃️ Java DB Info

- The project uses **Apache Derby (Java DB)** in **embedded mode**.
- You don’t need to create or connect to a remote DB manually.
- Files like `seg0/`, `service.properties`, and `README_DO_NOT_TOUCH_FILES.txt` are part of Derby’s database structure.

---

## 💡 Notes

- GUI `.form` files are editable only via **NetBeans GUI Builder**.
- `.class`, `dist/`, `build/`, and other auto-generated files are **not included** in version control.
- Use the `.gitignore` to keep your repo clean.

---

## 📦 Technologies Used

- Java SE
- Swing (GUI)
- Apache Derby (Java DB)
- NetBeans IDE

---

## 🙋‍♂️ Author
**Shlok Jain**
