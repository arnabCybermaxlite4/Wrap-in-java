package com.company;

import java.util.Scanner;

class rectangle {
    int length;
    int breadth;

    // Constructor to initialize the rectangle
    rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    int perimeter() {
        return 2 * (length + breadth);
    }
}
public class L26_OPPS_PQ85_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input length and breadth of the rectangle
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();
        // Create an instance of the rectangle class
        rectangle rect = new rectangle(length, breadth);

        // Calculate and print the area of the rectangle
        int area = rect.area();
        System.out.println("Area of the rectangle: " + area + " square units");

        // Calculate and print the perimeter of the rectangle
        int perimeter = rect.perimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter + " units");
    }
}
