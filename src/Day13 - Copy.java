import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
		System.out.println("ABCMAY19JPM2BTM106");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
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
