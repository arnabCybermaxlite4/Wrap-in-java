package com.company;

import java.util.Scanner;

public class L16_PQ43_reverse_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
