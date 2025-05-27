package com.company;

import java.util.Scanner;

public class L5_ex2 {
    public static void main(String[] args) {
        System.out.println("Taking the input" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        float num1 = sc.nextFloat();
        System.out.println("Enter the number2");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum of two numbers is : " + sum);
    }
}
