package com.company;

import java.util.Scanner;

public class L11_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper boundary number: ");
        int UBound = sc.nextInt();
        System.out.println("Enter the lower boundary number: ");
        int LBound = sc.nextInt();
        while (UBound >= LBound ){
            System.out.println(UBound);
            UBound--;
        }
    }
}
