package programing;

import java.util.Scanner;

public class Patv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j&& i<=n/2 || i+j==n-1&&i<=n/2)
				{
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
