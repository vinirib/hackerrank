package com.hackerrank.days30ofcode;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

/**
	Objective
	Today, we're learning about Interfaces. Check out the Tutorial tab for learning materials and an instructional video!
	
	Task
	The AdvancedArithmetic interface and the method declaration for the abstract int divisorSum(int n) method are provided for you in the editor below. Write the Calculator class, which implements the AdvancedArithmetic interface. The implementation for the divisorSum method must be public and take an integer parameter, , and return the sum of all its divisors.
	
	Note: Because we are writing multiple classes in the same file, do not use an access modifier (e.g.: public) in your class declaration (or your code will not compile); however, you must use the public access modifier before your method declaration for it to be accessible by the other classes in the file.
	
	Input Format
	
	A single line containing an integer, .
	
	Constraints
	
	Output Format
	
	You are not responsible for printing anything to stdout. The locked Solution class in the editor below will call your code and print the necessary output.

 * 
 */

interface AdvancedArithmetic{
	
	int divisorSum(int n);
}

class CalculatorClass implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 ) {
				sum += i;
			}
		}
		return sum;
	}
	
}

public class Day19 {
	
	public static void main(String[] args) {
		CalculatorClass calculatorClass = new CalculatorClass();
		System.out.println(calculatorClass.divisorSum(6));
	}
	
}




