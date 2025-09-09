package com.company;
// Create a class named Employee with the following attributes:
// id, salary, and name. Include a method to print the details of the employee.
class Employee {
    // Attributes of the class
    int id;
    int salary;
    String name;

    // Method to print the details of the employee
    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }
    // Method to get the name of the employee
    public String getName() {
        return name;
    }
    // Method to set the name of the employee
    public void setName(String name) {
        this.name = name;
    }
}
public class L26_OPPS_PQ82_customClass {
// Main class to demonstrate the Employee class
    public static void main(String[] args) {
        // Create an object of the class.
        Employee emp1 = new Employee();
        // Set the values of the object.
        emp1.id = 101;
        emp1.salary = 50000;
        emp1.name = "Alice";
        // Print the details of the employee.
        emp1.printDetails();
        // Access the salary of the employee using the getSalary method.
        int emp1Salary = emp1.getSalary();
        System.out.println("Employee 1's salary is: " + emp1Salary);
        // Access the name of the employee using the getName method.
        String emp1Name = emp1.getName();
        System.out.println("Employee 1's name is: " + emp1Name);
        // Set a new name for the employee using the setName method.
        emp1.setName("Bob");
        // Print the updated name of the employee.
        System.out.println("Employee 1's updated name is: " + emp1.getName());
    }
}
