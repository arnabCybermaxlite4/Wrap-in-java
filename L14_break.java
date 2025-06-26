package com.company;

import java.util.Scanner;

public class L14_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int year=2008; year<=n;year++){
            if (year<2025) {
                System.out.println(" It's the year of " + year + " You can't make it you have to wait and try harder next year !");
            } else if(year==2025){
                System.out.println(" And this this time RCB win the trophy in style ! ");
                break;
            }
        }
    }
}
