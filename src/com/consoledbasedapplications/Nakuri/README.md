# VCube Naukari Portal

A simple **Java console-based job eligibility checking application** that evaluates a candidate's profile based on qualification, branch, backlogs, CGPA, skills, experience, preferred location, and expected salary.

## 📌 Project Overview

**VCube Naukari Portal** is a beginner-friendly Java console application designed to simulate a basic job eligibility screening process.

The application collects candidate details and checks them against predefined eligibility criteria. If all the conditions are satisfied, the candidate is shortlisted for a **Java Developer** position.

## 🚀 Features

* Accepts candidate's full name
* Checks educational qualification
* Validates engineering branch
* Checks active backlogs
* Validates CGPA
* Checks Java skill
* Validates work experience
* Checks preferred job location
* Validates expected salary
* Displays eligibility status
* Displays shortlisted job details

## 🛠️ Technologies Used

* **Java**
* **Scanner Class**
* **Conditional Statements**
* **Nested if-else**
* **String methods**
* **Logical operators**
* **Primitive data types**

## 📋 Eligibility Criteria

The application checks the following conditions:

| Criteria        | Requirement                  |
| --------------- | ---------------------------- |
| Qualification   | BTech                        |
| Branch          | CSE / IT / ECE               |
| Backlogs        | 0                            |
| CGPA            | 6.5 or above                 |
| Skill           | Java                         |
| Experience      | 0 to 5 years                 |
| Location        | Hyderabad / Bangalore / Pune |
| Expected Salary | ₹3,00,000 to ₹6,00,000       |

## 🔄 Application Flow

```text
Start
  ↓
Enter Full Name
  ↓
Enter Qualification
  ↓
Is Qualification BTech?
  ↓ Yes
Enter Branch
  ↓
Is Branch CSE / IT / ECE?
  ↓ Yes
Enter Backlogs
  ↓
Are Backlogs 0?
  ↓ Yes
Enter CGPA
  ↓
Is CGPA >= 6.5?
  ↓ Yes
Enter Skill
  ↓
Is Skill Java?
  ↓ Yes
Enter Experience
  ↓
Is Experience between 0 and 5?
  ↓ Yes
Enter Preferred Location
  ↓
Is Location Hyderabad / Bangalore / Pune?
  ↓ Yes
Enter Expected Salary
  ↓
Is Salary between ₹3 LPA and ₹6 LPA?
  ↓ Yes
Profile Shortlisted
  ↓
End
```

## 💻 Sample Execution

```text
Welcome to VCube Naukari Portal !!
Your career starts from here.
Please enter your details to check job eligibility.

Enter Full Name:
Prashanth Potta

Hello Prashanth Potta.

Enter Qualification:
BTech

Enter Branch:
CSE

Do you have Any Backlogs:
0

Enter CGPA:
8.04

Enter Skills:
JAVA

Enter experience in years:
0

Enter Preferred Location:
Hyderabad

Enter Expected Salary Per Annum:
450000

Checking your profile...


Great!! Your qualification is matching.

Your CGPA is eligible..

Your skills is eligible..

You are eligible for the position:
--------------------------------------

Job Role       : Java Developer
Experience     : Fresher & Experience
Location       : Hyderabad,Bangalore,Pune
Salary         : 3 - 6 LPA

Congratulations Prashanth Potta!!
Your profile has been shortlisted.
```

## 📂 Project Structure

```text
myfirstproject
│
└── src
    └── com
        └── consoledbasedapplications
            └── Nakuri.java
```

## 🧠 Java Concepts Used

### 1. Scanner

The `Scanner` class is used to accept input from the user.

```java
Scanner sc = new Scanner(System.in);
```

### 2. Nested if-else

Multiple eligibility conditions are checked using nested `if-else` statements.

```java
if (q.equalsIgnoreCase("BTech")) {
    // qualification check
}
```

### 3. String Comparison

`equalsIgnoreCase()` is used so that inputs such as `JAVA`, `Java`, and `java` are treated equally.

```java
skills.equalsIgnoreCase("JAVA")
```

### 4. Logical Operators

The `||` operator is used to allow multiple valid branches or locations.

```java
branch.equalsIgnoreCase("CSE")
        || branch.equalsIgnoreCase("IT")
        || branch.equalsIgnoreCase("ECE")
```

The `&&` operator is used when multiple conditions must be satisfied.

```java
experience >= 0 && experience <= 5
```

## 🎯 Learning Objectives

This project helps beginners understand:

* User input using `Scanner`
* `if-else` conditions
* Nested conditional statements
* Logical operators
* String comparison
* Data types
* Basic validation
* Console-based application development
* Building a real-world eligibility-checking flow

## 🔮 Future Enhancements

The project can be improved by adding:

* Multiple job roles
* Multiple skills
* Percentage validation
* Resume upload functionality
* Candidate registration
* Login system
* Database connectivity using MySQL
* Menu-driven interface
* Multiple candidates
* Job search functionality
* Exception handling
* Object-Oriented Programming using classes and objects

## 👨‍💻 Author

**Prashanth Potta**

B.Tech Computer Science and Engineering

---

⭐ If you find this project useful, consider giving the repository a star!
