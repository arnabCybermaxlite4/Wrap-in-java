package com.company;

import java.util.Scanner;

public class L10_PQ16_pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics: ");
        int phy = sc.nextInt();
        System.out.println("Enter your marks in Chemistry: ");
        int chem = sc.nextInt();
        System.out.println("Enter your marks in Mathematics: ");
        int math = sc.nextInt();
        int total = phy+chem+math;
        System.out.println(" your total marks is : " + total);
        float avg = total/3.0f;
        System.out.println("Your average marks is : " + avg);
        if(avg>=40 && phy>33 && chem>33 && math>33){
            System.out.println("You passed the exam");
        }
        else{
            System.out.println("You failed the exam");
        }
    }
}
