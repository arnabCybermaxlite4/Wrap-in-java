package com.company;

import java.util.Scanner;

public class L9_PQ13_greater_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        boolean Condition = (num1>num2);
        if(Condition){
            System.out.println("The first number is greater than the second number");}
        else {
            System.out.println("The second number is greater than the first number");
        }

    }
}
