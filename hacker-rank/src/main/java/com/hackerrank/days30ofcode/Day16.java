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

public class Day16 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
			int integerValue = Integer.parseInt(S);
			System.out.println(integerValue);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
    }

}
