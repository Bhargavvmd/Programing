package com.hpe.arrays;

import java.util.Scanner;

public class SecondMaximumNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int Arr[] = new int[n];

		secondLargest(scan, n, Arr);
	}

	private static void secondLargest(Scanner scan, int n, int[] Arr) {
		int f = 0;
		int s = 0;
		for (int i = 0; i < n; i++) {
			Arr[i] = scan.nextInt();
			if (Arr[0] > Arr[1]) {
				f = Arr[0];
				s = Arr[1];
			} else if (Arr[0] < Arr[1]) {
				s = Arr[0];
				f = Arr[1];
			}
		}

		for (int i = 2; i < n; i++) {

			int k = Arr[i];
			if (k > f) {
				s = f;
				f = k;
			} else if (k > s) {
				s = k;
			}
		}
		System.out.println(s);
	}
}
