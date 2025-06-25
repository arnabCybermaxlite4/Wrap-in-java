package com.company;

import java.util.Scanner;

public class L13_PQ26_n_odd_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1 ; i <=n ; i++) {
            if(i%2!= 0) {
                System.out.println(i + " is an odd number!");
            }
        }
    }
}
/* different ways to solve the problem....
public class L13_PQ26_n_odd_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= n; i++){
        System.out.println(2*i+1);
       }
for desending the output in a single line....
for (int i = n; i >= 0; i--){
System.out.println(2*i+1);
output looks like then for n is 10 :: 1,3,5,7,9,11,13,15,17,19
 */