package com.hpe.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Sum {
	public static void main(String[] args) {
		int[] i = new int[5];
		for (int j = 1; j <= i.length; j++) {
			i[j-1] = j;
		}
		
		System.out.println(maxmiumNo(i));
		
		System.out.println(munium(i));
		String s ="bhargav";
		String s2="bhragav";
		System.out.println(s==s2);

	}

	private static int munium(int[] i) {
		int min = i[0];
		for (int j = 0; j < i.length; j++) {
			if (min > i[j]) {
				min = i[j];
			}
		}
		return min;
	}

	public static int maxmiumNo(int[] i) {
		/*for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}*/
		int max = i[0];
		for (int j = 0; j < i.length; j++) {
			if (max < i[j]) {
				max = i[j];
			}
		}
		return max;
	}
}
