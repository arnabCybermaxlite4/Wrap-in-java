package com.company;

import java.util.Scanner;

public class L25_recursion_PQ80_sumOf_n_terms {
    public static int sumOfN(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + sumOfN(n - 1);
    }
    /* another way to do it using while loop and recursion
    public static int sumOfN(int n) {
    int sum = 0;
    int temp = n;
    while (temp > 0) {
        sum += temp;
        temp--;
    }
    if (n > 0) {
        return sum + sumOfN(n - 1); // This will overcount, just for demonstration
    }
    return sum;
}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = sumOfN(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
