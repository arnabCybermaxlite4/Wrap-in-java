package com.company;

import java.util.Scanner;

public class L12_PQ23_multi_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("The table of " + num + " is : ");
        do{
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }
        while(i<=10);
    }
}
