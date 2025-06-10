package com.company;

import java.util.Scanner;

public class L9_PQ14_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want to check: ");
        int num = sc.nextInt();
        boolean condition = num%2==0;
        if (condition){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
