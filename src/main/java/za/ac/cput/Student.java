package za.ac.cput;

public abstract class Student {

    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Student Type: " + getStudentType());
    }
}
