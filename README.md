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
![img](https://github.com/benjoelreji/Blood-Bank-Management-System/blob/e88f96ddcb0e297e5df381035b0db3f06da40bc4/Screenshot%202026-02-11%20215645.png)

## Conclusion

The Blood Bank Management System successfully demonstrates:

* Java Swing GUI development
* Database connectivity using JDBC
* Implementation of CRUD operations
* Real-world desktop application development

---

If you want, I can also give you a more advanced README with badges and formatting to make your GitHub look more professional.

