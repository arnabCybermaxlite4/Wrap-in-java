package com.company;

import java.util.Scanner;

public class L5_PQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of 1st subject");
        double sub1 = sc.nextDouble();
        System.out.println("enter the marks of 2nd subject");
        double sub2 = sc.nextDouble();
        System.out.println("enter the marks of 3rd subject");
        double sub3 = sc.nextDouble();
        System.out.println("enter the marks of 4th subject");
        double sub4 = sc.nextDouble();
        System.out.println("enter the marks of 5th subject");
        double sub5 = sc.nextDouble();
        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("The total marks is : " + total);
        System.out.println("enter the number of subject you want for cgpa");
        int numberOfSubjects = sc.nextInt();
        double cgpa = (double)total/(numberOfSubjects*10);
        System.out.println("The cgpa is : " + cgpa);
    }
}
