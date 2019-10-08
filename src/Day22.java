import java.util.Scanner;

public class Day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM106");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if( i+j<=n &&i-j>=0 || i+j>=n &&i-j<=0) {
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
