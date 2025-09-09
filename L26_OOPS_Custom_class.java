package com.company;
class Employee2 {
    // Attributes of the class
    int id;
    int salary;
    String name;
    // Constructor to initialize the object
    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }
}
public class L26_OOPS_Custom_class {
    public static void main(String[] args) {
        System.out.println(" Creating a custom class in Java");
        // Creating an object of the class
        Employee2 arnab = new Employee2();
        Employee2 john = new Employee2(); // Creating another object of the class

        // Assigning values to the object's attributes
        arnab.id = 101;
        arnab.salary = 100000; // Assigning values to the object's attributes
        arnab.name = "Arnab"; // Assigning values to the object's attributes
        john.id = 102;
        john.salary = 34000;    // Assigning values to another object's attributes
        john.name = "John"; // Assigning values to another object's attributes

        // Printing the object's attributes
        System.out.println("Arnab's id is " + arnab.id);
        System.out.println("Arnab's name is " + arnab.name);

        // Calling the method to print details
        arnab.printDetails();

        // Accessing the salary of Arnab using the getSalary method
        int arnabSalary = arnab.getSalary();
        System.out.println("Arnab's salary is: " + arnabSalary);

        // Printing the second object's attributes
        System.out.println("John's id is " + john.id);
        System.out.println("John's name is " + john.name);

        // Calling the method to print details for John
        john.printDetails();

        // Accessing the salary of John using the getSalary method
        int johnSalary = john.getSalary();
        System.out.println("John's salary is: " + johnSalary);

    }
}