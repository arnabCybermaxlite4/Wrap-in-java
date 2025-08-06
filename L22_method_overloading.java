package com.company;

public class L22_method_overloading {

    // Method to calculate the sum of two integers
    static int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method to calculate the sum of three integers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to calculate the sum of two doubles
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10 is: " + sum(5, 10)); // Calls the first method
        System.out.println("Sum of 5, 10, and 15 is : " + sum(5, 10, 15)); // Calls the second method
        System.out.println("Sum of 5.5 and 10.5 is : " + sum(5.5, 10.5)); // Calls the third method
    }
}
