package com.company;

import java.util.Scanner;

public class L16_PQ35_Inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++){
            //for space inner loop
            for (int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            // for star inner loop
            for (int j = i; j >=1 ; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
