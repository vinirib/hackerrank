package com.hackerrank.days30ofcode;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

/**
 * Objective
 * 
 * Recursividade
 * 
 * 
 */

public class Day9 {
	
	//3! 3*2*1
	public static int Factorial(int n){
		if(n <= 1){
			return 1;
		}
		else {
			return n * Factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(Factorial(n));
	}
}
