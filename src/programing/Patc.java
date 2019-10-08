package programing;

import java.util.Scanner;

public class Patc {
	public static void main(String[] args) {
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0 || j==0&& i!=0 && i!=n-1||  i==n-1&&j!=0 ) {
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
