package programing;

import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<7;i++) {
			/*for(int j=0;j<7;j++) {
				System.out.print(" ");
			}*/
			for(int j=0;j<=n;j++) {
				if(i==j || i+j==n ) {
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
