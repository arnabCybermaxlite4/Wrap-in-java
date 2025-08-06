package com.company;

import java.util.Scanner;

public class L21_methods_PQ75_GCDCalculation {
    public static int calculateGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = Sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = Sc.nextInt();
        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}