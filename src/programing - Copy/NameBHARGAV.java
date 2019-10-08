package programing;

import java.util.Scanner;

public class NameBHARGAV {
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

			for(int j=0;j<n;j++) {
				if(j==0||j==n/2||i==n/2&&j<n/2)

				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(j==0 && i!=0|| j==n/2&& i!=0 ||
						i==n/2&& j<=n/2 ||i==0 && j<n/2 &&j!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(j==0||i==0&&j<n/2||i==n/2&&j<n/2||j==n/2&&i<=n/2|| i-j==n/2
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(j==0&&i!=0&&i!=n-1||  i==0&&j!=0&&j!=n-1 || i==n-1&& j<n/2 && j!=0 || j==n/2 && i>=3*n/4 || i==3*n/4&&j>=n/2
						||j==n-1&& i>3*n/4 || j==n-1&&i<n/4&&i!=0)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 && i!=0|| j==n/2&& i!=0 ||
						i==n/2&& j<=n/2 ||i==0 && j<n/2 &&j!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			for(int j=0;j<n;j++) {
				if(j==0&&i<n/2 || j==n-1 && i<n/2 || i-j==n/2 || i+j==n+n/2-1)
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
