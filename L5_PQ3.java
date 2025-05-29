package com.company;

import java.util.Scanner;

public class L5_PQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the value in kilometers");
        float km = sc.nextFloat();
        float miles = km/1.609f;
        System.out.println("The value of distance in Miles is : "+ miles );

    }
}
