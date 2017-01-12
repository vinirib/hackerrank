package com.hackerrank.algorithms;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int starQuantity = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		for (int j = 0; j < starQuantity; j++) {
			for (int i = 1; i <= starQuantity; i++) {
				System.out.print(i < starQuantity - j ? " " : "#");
			}
			System.out.println("");
		}
	}

}
