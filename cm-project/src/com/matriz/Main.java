package com.matriz;

import java.security.SecureRandom;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				matrix[l][c] = new SecureRandom().nextInt(10);
			}
		}
		
		System.out.println("Questão 01:");

		System.out.println("Matriz original:");
		MatrixInvertDiagonal.printMatrix(matrix);
		
		MatrixInvertDiagonal.invertDiagonals(matrix);
		
		System.out.println("\nMatriz invertida:");
		MatrixInvertDiagonal.printMatrix(matrix);
		
		System.out.println("\n//===========================//\n");

		
		System.out.println("Questão 02:");
		
		int[][] matrixA = {
	            {1, 2, 3, 4},
	            {2, 3, 4, 5},
	            {3, 4, 5, 6},
	            {4, 5, 6, 7}
	        };
		
		int[][] submatrixB = {
	            {2, 3},
	            {3, 4}
	        };
		
		int count = Submatrix.countingSubmatrix(matrixA, submatrixB);
		 System.out.println("A submatriz B pode ser encontrada " + count + " vezes na matriz A.");

	}

}
