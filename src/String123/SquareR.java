package String123;

import java.util.Scanner;

public class SquareR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size N ");
		squareRootOfArrayNo(scan);

	}

	private static void squareRootOfArrayNo(Scanner scan) {
		int n=scan.nextInt();
		int [] j= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values insertint in to the array at position "+i);
			int k=scan.nextInt();
			j[i] = k;
		}
		for(int i=0;i<n;i++) {
			System.out.println("The square root values of the given nos "+ j[i] +"="+Math.pow(j[i],2));
		}
	}

}
