package com.company;

import java.util.Scanner;

public class L17_PQ48_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the values: ");
        // taking input
        for (int i =0; i<size; i++){
          numbers[i] = sc.nextInt();
        }
// java initialize all the values 0 if we don't give value
        for (int i =0; i<size; i++){
            System.out.println("Enter the number: "+(numbers[i]));
        }

    }
}
