package com.company;

import java.util.Scanner;

public class L21_methods_PQ72_factorial {
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(n);
            System.out.println("The factorial of " + n + " is: " + result);
        }
    }
}
