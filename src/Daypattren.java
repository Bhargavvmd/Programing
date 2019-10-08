import java.util.Scanner;

public class Daypattren {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				System.out.print("*");

			}

			for(int j=0;j<n;j++) {
				if( i+j<=n-1 && i<=j || i+j>=n-1 && i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}

			for(int j=0;j<n;j++) {
				if( i+j<=n-1 &&i-j>=0 || i+j>=n-1 &&i-j<=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}


			for(int j=0;j<n;j++) {
				if( i==0 || j==0 || j==n-1 || i==n-1 ||i==n/2 || j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			for(int j=0;j<n;j++) {
				if( i+j<=n-1 &&i-j>=0 || i+j>=n-1 &&i-j<=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<n;j++) {
				if( i+j<=n-1 && i<=j || i+j>=n-1 && i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			for(int j=0;j<n;j++) {

				System.out.print("*");

			}
			
			for(int j=0;j<n;j++) {
				if( j==0 ||   i==n-1 || i==j) {
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
