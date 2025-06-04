package com.company;

import java.util.Scanner;

public class L8_PQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String ReplacedStr = str.replace(' ','_');
        System.out.println("The replaced string is : " + ReplacedStr);
    }
}
