package com.hackerrank.algorithms;

import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeDeNumeros = scanner.nextInt();
		scanner.nextLine();
		int[] numeros = new int[quantidadeDeNumeros];
		double positiveNumbers=0.0,negativeNumbers=0.0,zeroNumbers=0.0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
			if (numeros[i] < 0) {
				 negativeNumbers++;
			} else if(numeros[i] > 0){
				positiveNumbers++;
			} else {
				zeroNumbers++;
			}
		}
		scanner.close();
		System.out.printf("%.6f\n%.6f\n%.6f",positiveNumbers/quantidadeDeNumeros
				,negativeNumbers/quantidadeDeNumeros
				,zeroNumbers/quantidadeDeNumeros);
	}
}
