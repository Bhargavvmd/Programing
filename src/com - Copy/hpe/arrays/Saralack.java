package com.hpe.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Saralack {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int totalSum=0;
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			a.add(scan.nextInt());
			totalSum+=a.get(i);
			
		}
	
		System.out.println(totalSum);
		System.out.println(saralack(a, totalSum));
	}

	private static String saralack(ArrayList<Integer> a, int totalSum) {
		int presentSum=0;
		 for(int i=0;i<a.size();i++) {
			if(totalSum- presentSum-a.get(i)== presentSum) {
				return "YES";
			}
			 presentSum+=a.get(i);
		}
		 return "NO";
	}
}
