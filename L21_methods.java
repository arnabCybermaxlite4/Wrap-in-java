package com.company;

import java.util.Scanner;

public class L21_methods {
    // This method takes two integers X and Y, compares them, and returns their sum or difference.
 /*

    static int sum(int X, int Y) {
        int z; // Declare z as a local variable to store the result.
        if (X > Y) {
            z = X + Y;
        } else {
            z = X - Y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Please enter positive numbers only.");
        } else if (a == b) {
            System.out.println("Both numbers are equal. Please enter different numbers.");
        }else {
            int result = sum(a, b);
            System.out.println("The result is: " + result);
        }
    }
}
*/
    // This method takes two integers X and Y, compares them, and returns their sum or difference using object method.

    public static int sum(int X, int Y) {
        int z; // Declare z as a local variable to store the result.
        if (X > Y) {
            z = X + Y;
        } else {
            z = X - Y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Please enter positive numbers only.");
        } else if (a == b) {
            System.out.println("Both numbers are equal. Please enter different numbers.");
        } else {
            // Call the sum method to get the result
            L21_methods obj = new L21_methods(); // Create an instance of the class to call the non-static method.
            int result = obj.sum(a, b);
            System.out.println("The result is: " + result);
        }
    }
}