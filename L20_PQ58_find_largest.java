package com.company;

public class L20_PQ58_find_largest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("The original array is: ");
        // printing the original array.
        for( int element : arr){
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line for better readability
        // finding the largest element in the array.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
