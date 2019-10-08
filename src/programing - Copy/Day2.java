package programing;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		for (int j=0;j<n;j++) {
			for(int i=0;i<a;i++) {
				if(j==0||j==n/2||i==0||i==a-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
