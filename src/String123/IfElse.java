package String123;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int j = 0; j < 3; j++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			for (int i = s1.length(); i < 15; i++) {
				s1 = s1 + " ";
			}

			if (x < 100 && x > 10) {
				System.out.println(s1 + "0" + x);
			} else if (x < 10 && x > 0) {
				System.out.println(s1 + "00" + x);
			} else if (x == 0) {
				System.out.println(s1 + "000");
			} else {
				System.out.println(s1 + "" + x);
			}

			System.out.println("================================");
		}
		int i=sc.nextInt();
		Character c=(char)i;
		String s=c.toString();
		System.out.println(s);
		
	}

}