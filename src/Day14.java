import java.util.Scanner;

public class Day14 {
	public static void main(String[] args) {
		System.out.println("ABCMAY19JPM2BTM106");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if( i+j<=n-1 && i<=j || i+j>=n-1 && i>=j) {
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
