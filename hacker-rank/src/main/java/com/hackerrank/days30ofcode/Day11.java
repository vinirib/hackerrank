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

public class Day11 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low = -9,high = 5;
        int lh = low * high;
        int sum = 0, i, j;
        int max = 0;
        int a[][] = new int[6][6];
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < 4; i++) {
           for (j = 0; j < 4; j++) {
               sum = (a[i][j] + a[i][j+1] + a[i][j+2]); 
               sum = sum + a[i+1][j+1];
               sum = sum + (a[i+2][j] + a[i+2][j+1] + a[i+2][j+2]);

               if (sum > lh) lh = sum;
            }
        }
        System.out.print(lh);
    }

}
