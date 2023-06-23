package com.test.junit.activity5;

public class Ejercicio4 {
    public static int[][] getDiagonals(int[][] matrix) {
        int n = matrix.length;
        int[][] diagonals = new int[2][n];
        for (int i=0 ; i < n ; i++) {
            diagonals[0][i] = matrix[i][i];
            diagonals[1][i] = matrix[i][n-i-1];
        }
        return diagonals;
    }

    public static double[] addColumns(double[][] matrix) {
        int n = matrix.length;
        double[] colsum = new double[n];

        for (int i=0 ; i < n ; i++) {
            double sum = 0.0;
            for (int j=0 ; j<n ; j++) {
                 sum += matrix[j][i];
            }
            colsum[i] = sum;
        }
        return colsum;
    }
}
