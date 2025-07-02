package com.company;

import java.util.Scanner;

public class L16_PQ41_sum_of_first_n_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while( i<=n){
            sum += 2* i;
            i++;
        }
        System.out.println("The sum of the first " + n + " even numbers is : " + sum);
    }
}
