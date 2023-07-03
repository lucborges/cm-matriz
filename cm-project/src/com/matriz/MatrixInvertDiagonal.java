package com.matriz;

public class MatrixInvertDiagonal {
	public static void invertDiagonals(int[][] matrix) {
		int size = matrix.length;
		
		// invert primary diagonal
		for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - i - 1][j];
                matrix[size - i - 1][j] = temp;
            }
        }
		
		// invert secondary diagonal
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size - j - 1];
                matrix[i][size - j - 1] = temp;
            }
        }
	}
	
	public static void printMatrix(int[][] matrix) {
		int size = matrix.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
