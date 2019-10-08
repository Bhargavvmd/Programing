package com.hpe.arrays;

import java.util.Scanner;

public class ProdutArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[]= new int[scan.nextInt()];
		
		for(int i=0;i<Arr.length;i++) {
			Arr[i]=scan.nextInt();
		}
		int pro=1;
		for(int i=0;i<Arr.length;i++) {
			pro=pro*Arr[i];
			
		}
		int A1[]=new int[Arr.length];
		for(int i=0;i<Arr.length;i++) {
			A1[i]=pro/Arr[i];
		}
		
		for(int i=0;i<A1.length;i++) {
			System.out.print(A1[i]+" ");
		}
	}

}
