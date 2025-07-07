package com.company;
import java.util.Scanner;
public class L16_PQ47_choice_based_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int choice;
            double a, b;
            do {
                System.out.println("\n--- Calculator Menu ---");
                System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter first numbers: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second numbers: ");
                    b  = sc.nextDouble();
                } else {
                    a = b = 0 ; // default to avoid uninitialized warning
                }

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;
                    case 4:
                        if (b != 0)
                            System.out.println("Result: " + (a / b));
                        else
                            System.out.println("Error: Division by zero!");
                        break;
                    case 5:
                        System.out.println("Exiting Calculator...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 5);
    }
}
