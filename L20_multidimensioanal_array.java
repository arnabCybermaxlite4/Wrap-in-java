package com.company;

import java.util.Scanner;
public class L20_multidimensioanal_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks;// A 1-D array
        int[][] flats; // A 2-d array
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr= new int[row][col];
        // Taking input from user for each element of array using nested for loop.
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        // printing the element...
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
