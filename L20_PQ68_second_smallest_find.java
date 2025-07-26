package com.company;

public class L20_PQ68_second_smallest_find {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("The original array is: ");
        // printing the original array.
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line for better readability

        // finding the second smallest element in the array.
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element in the array is: " + second);
        }
    }
}
