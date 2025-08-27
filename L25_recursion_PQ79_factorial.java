package com.company;

import java.util.Scanner;

public class L25_recursion_PQ79_factorial {
    public static int factorial(int n){
        // condition check
        if(n == 0 || n == 1){
            return 1;
        }else {
            // recursive call
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int num = sc.nextInt();
        // calling the factorial function
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
