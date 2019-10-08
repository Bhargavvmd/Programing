package man;

import java.util.Scanner;

public class MainMan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		//first
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}

			for (int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for (int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//second
		for (int i=0;i<n;i++) {	
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}

			for (int j=0;j<n;j++) {
				if(j==n/2&&i<=n/2 || i==j && j>=n/2 || i==n/4 && j>=4*n/5 &&j<=9*n/10|| i==n/5 && j>=4*n/5&&j<=9*n/10 || i==2*n/3 && j>=9*n/10 || i==3*n/5 && j>=9*n/10)  {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for (int j=0;j<n;j++) {
				if(j==n/2&&i<n/2 || i+j==n-1 && i>=n/2 || i==3*n/5 && j<=n/10 ||  i==2*n/3 && j<=n/10 ||i==n/5 && j>=n/5 && j<=9*n/30 || i==n/4&& j>=n/5 && j<=9*n/30)  {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		//3
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>n-1 && i+j<n+n/2-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(i==0 && j<n/2 || j-i==n/2 || j==0)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(i==0 && j>n/2 || i+j==n/2 || j==n-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(i>j && i-j<n/2)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		//4
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1|| i+j==n-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(i==n-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(i==n-1 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if(i==n-1 || i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//last
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");	
			}
			
			for(int j=0;j<n;j++) {
				if(j==3 || j==5)				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(j==3 || j==5)
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
