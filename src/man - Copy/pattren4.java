package man;

import java.util.Scanner;

public class pattren4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1 && i<=j  ){
					
					System.out.print(i+" ");
				}
				else if(i+j<=n+1&&i>j){
					System.out.print(j+" ");
				}
				else if(i+j>=n+1 && i>=j){
					System.out.print(n-i+1 +" ");
				}
				else {
					System.out.print(n-j+1 +" ");
				}
				
			}
			System.out.println();
		}
	}

}
