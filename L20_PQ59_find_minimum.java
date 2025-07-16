package com.company;

public class L20_PQ59_find_minimum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8};
        System.out.println("The original array is: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(); // Move to the next line for better readability
        // Finding the minimum element in the array
        int min = Integer .MAX_VALUE; // Initialize min to the maximum possible integer value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
