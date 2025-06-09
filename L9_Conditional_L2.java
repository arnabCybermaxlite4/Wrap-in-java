package com.company;

import java.util.Scanner;

public class L9_Conditional_L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        boolean condition = age>=18;
        if(condition){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't vote");
        }
    }
}
