package com.company;

import java.util.Scanner;

public class L18_pattern_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number row rows:");
        int rows = sc.nextInt();
        // right side triangle
        /*for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        output :
        *
        **
        ***
        ****
        *****
        ******
         */

        // reverse right side triangle
       /*for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        output :
        ******
        *****
        ****
        ***
        **
        *
        */

        // reversed right side triangle
        /*for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        output:
        ******
         *****
          ****
           ***
            **
             *
        */
  /*      for (int i = rows; i >= 1; i--) {
            if (i == 1) {
                // first row all star
            for (int j = 1; j <=(2*rows-1); j++) {
                System.out.print("*");
            }
            } else {
                // left star
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print("*");
                }
                // middle spaces
                for (int j = 1; j <= 2*(i - 1)-1; j++) {
                    System.out.print(" ");
                }
                // right star
                for (int j = 1; j <=rows-i+1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }
          output:
*         *         }
**       **
***     ***
****   ****
***** *****
***********
*/
        /*for (int i =1; i<=rows; i++){
            if(i==1){
                for(int j=1; j<=(2*rows-1); j++){
                    System.out.print("*");
                }
            }else {
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print("*");
                }
            }
                System.out.println(" ");
        }
        OUTPUT:
        OPPOSITE OF UPPER PROBLEM JUST FLIP UPWARDS THE PATTERN
        */
        // SQUARE STAR
        /* for (int i = 1; i <= rows; i++){
            for (int j = 1; j <=rows ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        OUTPUT:
        SQUARE STAR PRINT
        */
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <=rows-3 ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}