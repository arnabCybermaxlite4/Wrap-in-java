package com.company;
class square {
    // Member variable to hold the side length of the square
    int side;

    // Method to calculate the area of the square
    int area() {
        return side * side;
    }

    // Method to calculate the perimeter of the square
    int perimeter() {
        return 4 * side;
    }
}
public class L26_OPPS_PQ84_square {
    public static void main(String[] args) {
        // Create an instance of the square class with side length 5
        square sq = new square();
        sq.side = 5; // Assigning the side length of the square
        // Calculate and print the area of the square
        int area = sq.area();
        System.out.println("Area of the square: " + area);

        // Calculate and print the perimeter of the square
        int perimeter = sq.perimeter();
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
