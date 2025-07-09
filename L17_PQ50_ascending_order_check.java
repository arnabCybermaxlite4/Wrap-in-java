package com.company;

import java.util.Scanner;

public class L17_PQ50_ascending_order_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the size of an array
        System.out.println(" enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // taking the input
        System.out.println(" enter the values: ");
        for (int i = 0; i < size; i++) {
           numbers[i] = sc.nextInt();
        }

        //searching
        boolean ascending = true;
        //(different approach) for( int i=0; i<numbers.length-1; i++)
        for (int i = 0; i < size-1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                ascending = false;
                break;
            }
        }
        // condition check
        if (ascending) {
            System.out.println("The array is in ascending order");
        } else {
            System.out.println("The array is not in ascending order");
        }
    }
}
