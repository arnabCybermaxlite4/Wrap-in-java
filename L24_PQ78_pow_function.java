package com.company;
import java.util.Scanner;

public class L24_PQ78_pow_function {
    // Function to calculate x raised to the power n
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        int pow = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + pow);
    }
}