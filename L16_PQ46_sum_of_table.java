package com.company;

import java.util.Scanner;

public class L16_PQ46_sum_of_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("The content of table is:" + " * " + i + " = " + n*i);
            sum += n*i;
        }
        System.out.println("The sum of the Multi-table's content is: " + sum);
    }
}
