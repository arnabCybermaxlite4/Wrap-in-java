package com.company;

import java.util.Scanner;

public class L20_PQ53_sum_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the size of the input.
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        // array declaration
        float elements[]= new float[size];

        // array elements declaration.
        System.out.println(" Enter the elements");
        for (int i =0; i<size; i++){
            elements[i] = sc.nextFloat();
        }
        // sum calculation.
        float sum = 0;
        for (int i =0; i<size; i++){
            sum = sum + elements[i];
        }
        System.out.printf("The sum is: %.2f", sum);
    }
}
