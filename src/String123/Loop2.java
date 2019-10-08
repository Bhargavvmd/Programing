package String123;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			int powerVal=0;
			for(int j=0; j<i; j++)
				powerVal+=Math.pow(2,j)*b;

			int result = a+powerVal;
			System.out.println("s-"+i+"="+result);
		}

		in.close();
	}
}