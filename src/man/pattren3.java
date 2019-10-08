package man;

import java.util.Scanner;

public class pattren3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count =1;
		for (int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.print(i+1);
		}
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			if(i%2!=0) {
			System.out.print(i+1);
		}
		System.out.println();	
		}
	}
}
