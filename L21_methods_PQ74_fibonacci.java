package com.company;

import java.util.Scanner;

public class L21_methods_PQ74_fibonacci {
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 1) {
            System.out.print(a + " ");
            return;
        }
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series: ");
        fibonacci(n);
    }
}