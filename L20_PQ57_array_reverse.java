package com.company;

public class L20_PQ57_array_reverse {
    public static void main(String[] args) {
        // initializing the array.
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The original array is: ");
        // printing the original array.
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(); // Move to the next line for better readability
        // reversing the array.
        for (int i = 0; i < arr.length / 2; i++) {
            // swapping the elements.
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i]; // inter changing the elements from the front and back.
            arr[arr.length - 1 - i] = temp; // this line because again we initialize the changed array elements from the
                                            // back so that temp is again acts like the original array elements.
        }
        System.out.println("The reversed array is: ");
        // printing the reversed array.
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(); // Move to the next line for better readability


    }

}