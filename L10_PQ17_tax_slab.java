package com.company;

import java.util.Scanner;

public class L10_PQ17_tax_slab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your annual income (in INR) : ");
        double  income = sc.nextFloat();
        double tax = 0.0 ;
        if(income<2.5){
            tax = (float) (income*0.0);
        }
        else if(income>2.5 && income<=5.0){
            tax = ((income - 2.5)*0.05);
        }
        else if ( income>5.0 && income<=10.0){
            tax =((income - 2.5)*0.05)+((income - 5.0)*0.20);
        }
        else {
            tax = ((income - 2.5)*0.05)+((income - 5.0)*0.20)+((income - 10.0)*0.30);
        }
        System.out.println("you have to pay " + tax + " as tax (powered by Nirmala Sitaraman)");
    }
}
