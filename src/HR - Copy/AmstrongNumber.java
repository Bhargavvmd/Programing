package HR;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int k=s.nextInt();
for (int i = 1; i < k; i++) {
			int sum = 0;
			int temp = i;
			while (temp >= 1) {
				int d = temp % 10;
				sum += Math.pow(d, 3);
				temp = temp / 10;
			}

			if (i == sum) {
				System.out.println(i);
			}
		}
	}
}


