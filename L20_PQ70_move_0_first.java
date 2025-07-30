package com.company;

import java.util.Scanner;
// This program moves all non-zero elements of an array to the end while keeping the order of non-zero elements.
public class L20_PQ70_move_0_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic: move non-zero elements to the end (from right to left)
        int j = size - 1;
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }
        // Fill remaining positions with 0
        while (j >= 0) {
            arr[j] = 0;
            j--;
        }
        // Output
        System.out.print("Array after moving zeros to front: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}