package com.company;

import java.util.Scanner;

public class L17_PQ51_array_input_as_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size declaration
        System.out.println(" Enter the size of the array: ");
        int size = sc.nextInt();
        String array[] = new String[size];

        // taking the values
        System.out.println("Enter the names: ");
        for (int i =0; i<size; i++){
            array[i] = sc.next();
        }

        // printing the names
        for (int i =0; i<size; i++){
            System.out.println("The name is: "+array[i]);
        }
    }
}
