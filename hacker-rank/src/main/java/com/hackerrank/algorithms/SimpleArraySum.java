package com.hackerrank.algorithms;

import java.util.Scanner;

/**
 * 
 * Given an array of integers, can you find the sum of its elements?

Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11

Sample Output

31

Explanation

We print the sum of the array's elements, which is
 *
 */
public class SimpleArraySum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		scan.nextLine();
		String[] arrayOfNumbers = scan.nextLine().split(" ");
		int sum = 0;
		
		for (int i = 0; i < arraySize; i++) {
			sum += Integer.parseInt(arrayOfNumbers[i]);
		}
		
		System.out.println(sum);
		scan.close();
		
	}

}
