package com.company;

public class L23_varargs {
    // Method to calculate the sum of an arbitrary number of integers using varargs
    static int sum(int... numbers) {
        int total = 0; // Initialize total to 0
        for (int num : numbers) { // Iterate through each number in the varargs array
            total += num; // Add each number to the total
        }
        return total; // Return the final sum
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, and 3 is: " + sum( 1, 2, 3)); // Calls the method with three arguments
        System.out.println("Sum of 4, 5, 6, and 7 is: " + sum(4, 5, 6, 7)); // Calls the method with four arguments
        System.out.println("Sum of 10,11,12,15,17 and 20 is: " + sum(10,11,12,15,17, 20)); // Calls the method with two arguments
        System.out.println("Sum of no numbers is: " + sum()); // Calls the method with no arguments
    }
}
