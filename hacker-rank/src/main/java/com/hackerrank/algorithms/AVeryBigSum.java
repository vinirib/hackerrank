package com.hackerrank.algorithms;
import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		scan.nextLine();
		long[] valuesToSum = new long[arraySize];
		for (int i = 0; i < arraySize; i++) {
			valuesToSum[i] = scan.nextLong();
		}
		
		long totalSum = 0;
		for (long value : valuesToSum) {
			totalSum += value;
		}
		
		System.out.println(totalSum);
	}

}
