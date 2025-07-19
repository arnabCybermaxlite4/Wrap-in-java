package com.company;

import java.util.Scanner;

public class L20_PQ61_find_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the array: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column of the array: ");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        // taking input
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // output the array
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        // value that you want to search
        System.out.println("Enter the number to search: ");
        int search = sc.nextInt();
        // searching
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == search) {
                    System.out.println("The number is found at index: [" + i + "][" + j + "]");
                    break;
                }
            }
        }
    }
}
