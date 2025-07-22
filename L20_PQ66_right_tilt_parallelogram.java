package com.company;

import java.util.Scanner;

public class L20_PQ66_right_tilt_parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        // right tilted parallelogram
        for (int i = 1; i <= rows; i++) {
            // printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
