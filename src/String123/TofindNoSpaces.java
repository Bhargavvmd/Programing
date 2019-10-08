package String123;

import java.util.Scanner;

public class TofindNoSpaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine();
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) ==' ') { 
				count=count+1;

			} else {
				
			}

		}
		System.out.println(count);
	}
}
