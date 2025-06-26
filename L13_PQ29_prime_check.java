package com.company;

import java.util.Scanner;

public class L13_PQ29_prime_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println("The number is neither prime nor composite !");
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                System.out.println("Checking if " + n + " is divisible by " + i);
                if (n % i == 0) {
                    System.out.println(n + " is divisible by " + i);
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println("The number is prime !");
            } else {
                System.out.println("The number is composite !");
            }
        }
    }
}