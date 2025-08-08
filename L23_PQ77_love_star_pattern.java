package com.company;

public class L23_PQ77_love_star_pattern {
    public static void main(String[] args) {
        int n = 6; // size

        // Upper part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (i == n / 2 && j != 1 && j != i) {
                    System.out.print(" ");
                } else if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (i == n / 2 && j != 1 && j != i) {
                    System.out.print(" ");
                } else if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the heart
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j == 1 || j == (i * 2) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}