package com.company;
import java.util.Scanner;

public class L20_PQ69_move_0_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare and input array
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic to move all zeros to end
        int j = 0; // pointer to track non-zero elements
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Output
        System.out.print("Array after moving zeros to end: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
