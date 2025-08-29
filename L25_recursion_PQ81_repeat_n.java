package com.company;

import java.util.Scanner;

public class L25_recursion_PQ81_repeat_n {
    public static void repeat(int n) {
        if (n <= 0) {
            return; // Base case: if n is 0 or negative, stop recursion
        }
        System.out.println(4); // Print the number
        repeat(n-1); // Recursive call with the same number

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to repeat: ");
        int n = sc.nextInt();
        System.out.println("Repeating the number: ");
        repeat(n);
    }
}
