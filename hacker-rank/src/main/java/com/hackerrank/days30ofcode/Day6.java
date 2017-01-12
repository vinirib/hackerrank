package com.hackerrank.days30ofcode;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

/**
 * Objective
 * 
 * 
 * 
 * 
 */

public class Day6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();
		String[] strings = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			String word = scanner.nextLine();
			strings[i] = word;
		}
		for (int i = 0; i < strings.length; i++) {
			oddAndEvenPrint(strings[i].toCharArray());
		}
	}

	private static void oddAndEvenPrint(char[] wordArray) {
		//even par
		for (int i = 0; i < wordArray.length; i+=2) {
			System.out.print(wordArray[i]);
		}
		System.out.print(" ");
		//odd - impar
		for (int i = 1; i < wordArray.length; i+=2) {
			System.out.print(wordArray[i]);
		}
		System.out.println("");
	}	
}
