package com.company;

import java.util.Scanner;

public class L10_PQ18_day_choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your choice number ");
        int choice_num = sc.nextInt();
        System.out.print("Today is ");
        switch (choice_num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println(" Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }
        sc.close();
    }
}
