package com.hackerrank.algorithms;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arraySize = scan.nextInt();
		scan.nextLine();
		
		int[][] matrix = new int[arraySize][arraySize];
		
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			primaryDiagonalSum += matrix[i][i];
		}
		for (int i = 0; i < matrix.length; i++) {
			int position = matrix.length - 1 -i;
			secondaryDiagonalSum += matrix[i][position];
		}
		System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
	}
}
