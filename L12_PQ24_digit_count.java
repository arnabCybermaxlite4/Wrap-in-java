package com.company;

import java.util.Scanner;

public class L12_PQ24_digit_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int count =0;
        do{
            number = number/10;
            count++;
        }
        while(number!=0);
        System.out.println("the number of digit's ine the number is : " +count);
    }
}
