package com.company;

import java.util.Scanner;

public class L20_PQ65_alpha_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            char ch = 'A';
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print characters
            for (int k = 1; k <= i; k++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
