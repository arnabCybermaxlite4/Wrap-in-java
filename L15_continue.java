package com.company;

import java.util.Scanner;

public class L15_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        int n = sc.nextInt();
        for (int date =1;date <= n; date ++){
            if(date==15){
                System.out.println("I don't wanna recall the day !");
                continue;
            }
            System.out.println(" Dates is:" +date);
        }
    }
}

