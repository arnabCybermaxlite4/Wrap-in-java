package com.company;

import java.util.Scanner;

public class L17_PQ49_array_val_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int [size];

        //taking input!
        System.out.println("Enter the values: ");
        for (int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // value that you want to search!
        System.out.println(" Enter the number to search:");
        int search = sc.nextInt();

        // searching
        for (int i =0; i<size; i++){
            if (numbers[i]==search){
                System.out.println("The number is found at index: "+i);
            }
        }

    }
}
