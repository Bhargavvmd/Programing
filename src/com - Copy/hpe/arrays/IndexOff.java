package com.hpe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOff {
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int []ar=new int[scan.nextInt()];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("enter the key");
		int n=scan.nextInt();
	
	
	
//	System.out.println(searching(ar, n));
	System.out.println(binarySearch(ar, n));
	}

	private static int binarySearch(int[] ar, int n) {
	
		int low =0;
		int high=0;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(ar[mid]==n) {
				return mid;
			}else if(n>ar[mid]){
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}

	private static int searching(int[] ar, int n) {
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n) {
				return i;
			}
			
			
		}
		return -1;
	}

}
