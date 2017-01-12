package com.hackerrank.algorithms;

import java.util.Scanner;

public class ComparetheTriplets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a0 = scan.nextInt();
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int b0 = scan.nextInt();
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();

		int aliceScore = 0;
		int bobScore = 0;

		if (a0 > b0) {
			aliceScore++;
		} else {
			bobScore++;
		}
		if (a1 > b1) {
			aliceScore++;
		} else {
			bobScore++;
		}
		if (a2 > b2) {
			aliceScore++;
		} else {
			bobScore++;
		}
		System.out.println(aliceScore + " " + bobScore);

	}
}
