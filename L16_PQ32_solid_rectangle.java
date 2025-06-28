package com.company;

import java.util.Scanner;

public class L16_PQ32_solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of row lines: ");
        int r = sc.nextInt();
        System.out.println(" Enter thw value of column lines: ");
        int c = sc.nextInt();
        // outer loop for row
        for(int i=1;i<=r;i++){
            // inner loop for column
            for (int j=1;j<=c;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
