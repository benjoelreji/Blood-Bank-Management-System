# Blood-Bank-Management-System
Here is your **clean copy-paste README content** (no extra formatting instructions, ready for GitHub):

---

# 🩸 Blood Bank Management System

---

## 1. Project Title and Team Members

### Project Title:

Blood Bank Management System

### Team Members:

* Ben Joel Reji(24ubc224)
* Amal Manesh(24ubc212)

---

## 2. Problem Statement and Objective

### Problem Statement:

Managing blood donors and blood requests manually can lead to errors, data loss, and delays during emergencies. Hospitals and blood banks require a reliable system to efficiently store, retrieve, and manage donor and blood request information.

### Objective:

The objective of this project is to develop a desktop-based Blood Bank Management System using Java and MySQL that:

* Stores donor information securely
* Manages blood availability
* Handles blood requests efficiently
* Performs CRUD operations (Create, Read, Update, Delete)
* Provides a user-friendly graphical interface

---

## 3. Features and Technologies Used

### Features:

* Login and Signup Authentication
* Donor Registration
* Blood Request Management
* View Donor Records
* Edit Existing Records
* Delete Records from Database
* MySQL Database Integration
* Clean and Modern Java Swing UI

### Technologies Used:

* Programming Language: Java
* GUI Framework: Java Swing
* Database: MySQL
* Connectivity: JDBC
* IDE: NetBeans / IntelliJ IDEA / Eclipse

---

## 4. Steps to Run the Program

### Step 1: Clone the Repository

```
git clone https://github.com/your-username/blood-bank-management-system.git
```

### Step 2: Setup Database

1. Open MySQL.
2. Create a database:

```
CREATE DATABASE bloodbank;
```

3. Import the provided `database.sql` file.
4. Update database credentials inside `DBConnection.java`:

```
String url = "jdbc:mysql://localhost:3306/bloodbank";
String user = "root";
String password = "your_password";
```

---

### Step 3: Run the Project

* Open the project in your IDE.
* Run `LoginPage.java` as the main file.
* The application window will open.

---

## 5. Screenshots of the GUI

(Add screenshots of the following pages in your GitHub repository)

* Login Page
* Donor Registration Page
* Blood Request Page
* Dashboard Page
* Database Table View

---

## 6. Sample Inputs and Outputs / Test Cases

### Test Case 1: Donor Registration

Input:

* Name: John Mathew
* Blood Group: O+
* Age: 25
* Contact: 9876543210

Expected Output:

* Donor details successfully stored in the database.
* Message displayed: "Donor Registered Successfully"

---

### Test Case 2: Blood Request

Input:

* Patient Name: David
* Blood Group: B+
* Units Required: 2

Expected Output:

* Request saved in database.
* Confirmation message displayed.

---

### Test Case 3: Edit Record

Action:

* Update donor contact number.

Expected Output:

* Database record updated successfully.

---

### Test Case 4: Delete Record

Action:

* Delete donor by ID.

Expected Output:

* Record removed from database.
* Confirmation message displayed.

---
## Screenshots
---
![img1](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/8a523f4b0f0b1e1545a314a1d0b83a71397212eb/Screenshot%202026-02-11%20215645.png)
![img2](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/74906bd2d46d964863c5c34f926a310838726233/Screenshot%202026-02-11%20215657.png)
![img3](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/5d255ed857c493d451f76dfe45a6f53781a16149/Screenshot%202026-02-11%20215723.png)
![img4](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/09019beda671b36e19985b8006f9ab07a209aae9/Screenshot%202026-02-11%20215827.png)
![img5](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/afd92220e33293d6e4c224a18025b38ebcab99ad/Screenshot%202026-02-11%20215839.png)
![img6](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/ce7ffc769d6190351fab7dfbf768a8dcc2594131/Screenshot%202026-02-11%20215937.png)
![img7](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/91e54e2fbae3f95ed9e9679057d18e2e3b4805db/Screenshot%202026-02-11%20215954.png)
## Conclusion

The Blood Bank Management System successfully demonstrates:

* Java Swing GUI development
* Database connectivity using JDBC
* Implementation of CRUD operations
* Real-world desktop application development

---

If you want, I can also give you a more advanced README with badges and formatting to make your GitHub look more professional.

