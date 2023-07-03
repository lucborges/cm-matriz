package com.matriz;

public class Submatrix {
	 public static int countingSubmatrix(int[][] matrixA, int[][] submatrixB) {
        int count = 0;
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = submatrixB.length;
        int colsB = submatrixB[0].length;

        for (int i = 0; i <= rowsA - rowsB; i++) {
            for (int j = 0; j <= colsA - colsB; j++) {
                if (verifySubmatrix(matrixA, submatrixB, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }
	 
	 public static boolean verifySubmatrix(int[][] matrixA, int[][] submatrixB, int startRow, int startCol) {
        int rowsB = submatrixB.length;
        int colsB = submatrixB[0].length;

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                if (matrixA[startRow + i][startCol + j] != submatrixB[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
