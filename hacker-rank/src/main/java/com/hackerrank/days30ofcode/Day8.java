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

public class Day8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneMap = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phoneMap.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			Integer phone = phoneMap.get(s);
			if (phone == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s+"="+phone);
			}
		}
		in.close();
	}
}
