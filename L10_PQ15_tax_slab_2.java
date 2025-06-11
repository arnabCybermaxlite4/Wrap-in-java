package com.company;
import java.util.Scanner;
public class L10_PQ15_tax_slab_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            double tax = 0;
            System.out.print("Enter your yearly income (in ₹): ");
            double income = sc.nextDouble();
            if (income <= 250000) {
                tax=0;
            }
            else if (income > 250000 && income <= 500000) {
                tax = tax + (income - 250000) * 0.05f;
            }
            else if (income > 500000 && income <= 1000000) {
                tax = tax + (income -250000)*0.05f + (income - 500000)*0.2f;
            }
            else if (income > 1000000){
                tax = tax + (income - 250000)*0.05f + (income - 500000)*0.2f + (income - 1000000)*0.3f;
            }
        System.out.println("Your tax is " + tax);
    }
}