package com.company;

import java.util.Scanner;

public class L10_PQ19_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the year that you want to check: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
