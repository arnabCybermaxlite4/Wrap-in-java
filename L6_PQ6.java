package com.company;

import java.util.Scanner;

public class L6_PQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 'A';
        System.out.println("The grade is : " + grade);
        grade = (char) (grade + 8);
        System.out.println("The grade in front of father is : " + grade);
        grade = (char) (grade - 8);
        System.out.println("The grade in back of father is : " + grade);
    }
}
