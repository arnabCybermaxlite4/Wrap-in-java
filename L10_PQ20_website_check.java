package com.company;

import java.util.Scanner;

public class L10_PQ20_website_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name: ");
        String url = sc.nextLine().toLowerCase();
        if(url.endsWith(".com")){
            System.out.println(" The website is a Commercial website");
        }
        else if(url.endsWith(".org")) {
            System.out.println(" The website is a Organization website");
        }
        else if (url.endsWith(".net")) {
            System.out.println(" The website is a Net website");
        }
        else if (url.endsWith(".in")) {
            System.out.println(" The website is a indian website");
        }
        else{
            System.out.println(" The website is not a valid website");
        }
    }
}