package com.hackerrank.days30ofcode;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given:
 */

public class Day20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt(); // tip percentage
		int[] arr = new int[numberOfElements];
        for(int i=0; i < numberOfElements; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
		
        int swaps = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swaps ++;
				}
			}
		}
        
        System.out.println("Array is sorted in "+swaps+ " swaps.");
        System.out.println("First Element: " +arr[0]);
        System.out.println("Last Element: " +arr[arr.length - 1]);
	}
}
