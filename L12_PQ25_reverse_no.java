package com.company;

import java.util.Scanner;

public class L12_PQ25_reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        do{
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        while(num!=0);
        System.out.println("The reverse of the number is : " + rev);
    }
}
