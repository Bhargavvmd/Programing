package programing;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.println("ABCMAY19JPM2BTM105");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
