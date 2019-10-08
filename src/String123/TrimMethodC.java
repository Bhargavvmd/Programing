package String123;

import java.util.Scanner;

public class TrimMethodC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine();
		int c=0;
		String o="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				
			}
			else {
				c=c+1;
				o=o+s.charAt(i);
			}
			
		}
		System.out.println(c);
		System.out.println(o);
	}

}
