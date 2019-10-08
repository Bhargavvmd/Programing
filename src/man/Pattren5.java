package man;

import java.util.Scanner;

public class Pattren5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		int  res=0;
		
		for (int i=1;i<=n;i++) {
			if(i%2==0) {
				count=i*(i+1)/2;
			}
			for(int j=1;j<=i;j++) { 
				res++;
			if(i%2==0) {
					System.out.print(count--+" ");
				}
				else {
					System.out.print(res+" ");
				}
			}
			System.out.println();
		}
	}
}
