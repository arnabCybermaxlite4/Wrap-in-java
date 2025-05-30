package com.company;
import java.util.Scanner;
public class L5_Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input!");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number1");
        int a = sc.nextInt();
        System.out.println(" Enter the number2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two numbers is : " + sum);
    }
}
