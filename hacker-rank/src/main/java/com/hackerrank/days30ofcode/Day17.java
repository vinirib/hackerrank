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

public class Day17 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
    }        

}


class Calculator {
	
	public int power(int n, int p){
		
		if (n < 0 || p < 0) {
			throw new RuntimeException("n and p should be non-negative");
		} else  if (p == 0){
			return 1;
		} else {
			return n * power(n, p -1);
		}
	}

}