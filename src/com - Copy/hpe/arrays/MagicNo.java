package com.hpe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicNo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Arr[] = new int[scan.nextInt()];

		magicNumber(scan, Arr);
	}

	/*
	 * The first given array is not sorted Array After the sorting Array what ever
	 * the index places are not changed that numbers are treated as good other are
	  treated as the bad the difference between good and bad is know as magic
	 * number
	 * 
	 */
	private static void magicNumber(Scanner scan, int[] Arr) {
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = scan.nextInt();
		}
		int ar[] = Arrays.copyOf(Arr, Arr.length);
		Arrays.sort(ar);
		int good = 0;
		int bad = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == Arr[i]) {
				good = good + ar[i];
			} else {
				bad += ar[i];
			}
		}
		System.out.println("the magic num : " + (good - bad));
	}
}
