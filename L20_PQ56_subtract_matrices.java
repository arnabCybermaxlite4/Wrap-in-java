package com.company;

public class L20_PQ56_subtract_matrices {
        public static void main(String[] args) {
            // Define two 2x3 matrices
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
            int[][] matrix2 = {
                    {7, 8, 9},
                    {10, 11, 12}
            };
            // Create a result matrix
            int[][] result = new int[2][3];
            // Subtract matrices
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            // Print the result
            System.out.println("Difference of the two matrices is:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println(); // Move to the next row
            }
        }
    }
