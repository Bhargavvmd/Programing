package programing;

import java.util.Scanner;

public class PatB {

	public static void main(String[] args) {
		System.out.println("ABCMAY19JPM2BTM105");
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||i==0&&j<n/2||i==n/2&&j<n/2||
						
						i==n-1&&j<n/2
						||(j==n/2&&i!=0&&i!=n/2&&i!=n-1)) {
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
