package com.company;

public class L22_PQ76_method_overloading_area_cal {
        void calculate(double radius) {
            System.out.println("Area of circle: " + (3.14 * radius * radius));
        }
        void calculate(int side) {
            System.out.println("Area of square: " + (side * side));
        }

        void calculate(int length, int breadth) {
            System.out.println("Area of rectangle: " + (length * breadth));
        }

        void calculate(int base, int height, boolean isTriangle) {
            if (isTriangle) {
                System.out.println("Area of triangle: " + (0.5 * base * height));
            } else {
                System.out.println("Invalid parameters for triangle area calculation.");
            }
        }

        public static void main(String[] args) {
            L22_PQ76_method_overloading_area_cal obj =  new L22_PQ76_method_overloading_area_cal();
            obj.calculate(5.0);  // Circle
            obj.calculate(4, 6);// Rectangle
            obj.calculate(3);// Square
            obj.calculate(4, 5, true); // Triangle
        }
}
