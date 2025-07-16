package com.company;

import java.util.Scanner;

public class L20_PQ60_sort_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input for the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the values: ");
        // taking input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // checking if the array is sorted or not
        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }
        // output
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
