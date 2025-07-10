package com.company;
 import java.util.Scanner;
public class L17_PQ52_min_max_find {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // size declaration
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        // initialize
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // checking
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

    }
}
