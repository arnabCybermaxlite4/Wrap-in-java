package com.company;

import java.util.Scanner;

public class L13_PQ27_reverse_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        for(int i =n ; i!=0 ; i--){
            System.out.println(i);
        }
    }
}
