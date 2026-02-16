
#  GitHub Repository

The complete source code for this assignment has been uploaded to a GitHub repository as required.
The repository is properly organized and contains all Java classes, test classes, and documentation.

#  Project Overview
The system supports different types of students:

* Undergraduate Students
* Graduate Students

Each student has required attributes:

* Student ID
* Name
* Email
* Department

#  Classes Implemented

## 1️ Student (Abstract Base Class)

The Student class contains common attributes and abstract methods that subclasses must implement.


public abstract class Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();
}

## 2️ UndergraduateStudent

Extends Student and includes additional fields:

* creditHours
* scholarshipAmount

This class calculates tuition based on credit hours and scholarship amount.
It also contains its own Builder class for object creation.

## 3️ GraduateStudent

Extends Student and includes additional fields:

* researchAssistant (boolean)
* stipend

This class calculates tuition based on research assistant status and stipend.
It also includes its own Builder class.

#  Inheritance and Polymorphism

Inheritance is demonstrated where subclasses extend the base class:


public class UndergraduateStudent extends Student
public class GraduateStudent extends Student

Polymorphism is shown through method overriding:


@Override
public double calculateTuition()


Each subclass provides its own tuition calculation.

#  SOLID Principles Applied

## 1️ Single Responsibility Principle (SRP)

Each class has one responsibility:

* Student → Stores common student attributes
* UndergraduateStudent → Handles undergraduate data and tuition calculation
* GraduateStudent → Handles graduate data and tuition calculation
* Builder classes → Handle object construction only

Example from UndergraduateStudent:

private int creditHours;
private double scholarshipAmount;

This separation ensures the system is modular and maintainable.

## 2️ Open/Closed Principle (OCP)

The system is open for extension but closed for modification.

Because all student types inherit from `Student`, new student types can be added without changing existing classes.

Example extension:


public class PartTimeStudent extends Student {
    @Override
    public double calculateTuition() {
        return 8000;
    }

    @Override
    public String getStudentType() {
        return "Part-Time Student";
    }
}

This shows the design supports future expansion while protecting current code.


#  Builder Pattern Implementation

Each subclass has its own Builder class used to create objects step-by-step.

Example:

UndergraduateStudent student =
    new UndergraduateStudent.Builder()
        .studentId("U101")
        .name("Naledi Ngobeni")
        .email("naledi@gmail.com")
        .department("IT")
        .creditHours(5)
        .scholarshipAmount(2000)
        .build();

The Builder Pattern:

* Handles optional attributes
* Improves readability
* Avoids large constructors

#  Program Execution

The Main class creates objects for both subclasses using the Builder Pattern and displays their details.

Running the program prints all student information and calculated tuition fees in the console.

# Conclusion

This assignment demonstrates:

* Implementation of the Builder Design Pattern
* Use of Inheritance and Polymorphism
* Application of SOLID Principles (SRP and OCP)
* Clean, modular, and extensible Java code

The system design allows future student types to be added without modifying existing functionality.
