package com.company;

import java.util.Scanner;

public class L8_PQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Double space detected at the index of  :" + str.indexOf("  "));
        System.out.println("Triple space detected at the index of :" + str.indexOf("   "));

    }
}
