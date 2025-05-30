package com.company;

import java.util.Scanner;

public class L5_Q1solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject number");
        int sub1 = sc.nextInt();
        System.out.println("Enter the second subject number ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the third subject number ");
        int sub3 = sc.nextInt();
        System.out.println(" Enter the fourth subject number ");
        int sub4 = sc.nextInt();
        System.out.println("Enter the fifth subject number ");
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Enter the full marks");
        int fullmarks = sc.nextInt();
        double percentage = (double)total/fullmarks * 100;
        System.out.println("The percentage is : " + percentage);
    }
}
