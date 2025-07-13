package com.company;

import java.util.Scanner;

public class L20_PQ54_average_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the size of the array.
        System.out.println(" Enter the size of the array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        // array element taking.
        System.out.println("Enter the array element: ");
        for (int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // average calculation.
        int sum =  0;
        for (int i=0; i<size; i++){
            sum = (sum + arr[i]);
        }
        System.out.println("The average mark is :"+sum/size);
    }
}
