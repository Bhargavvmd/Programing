package com.hpe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiffernceOfKey {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size : ");
		int[] a = new int[scan.nextInt()];
		System.out.println("enter the key :");
		int key = scan.nextInt();
		sumOfvalueOfpairKey(scan, a, key);
	}

	private static void sumOfvalueOfpairKey(Scanner scan, int a[], int key) {
		System.out.println("enter the elements :");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (key == a[j] - a[i]) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}



}
