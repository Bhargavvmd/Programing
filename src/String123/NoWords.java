package String123;

import java.util.Scanner;

public class NoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine().trim();
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) ==' ' && s.charAt(i+1)!=' ') {
				count=count+1;

			} else {
				
			}

		}
		System.err.println(count+1);
	}

}
