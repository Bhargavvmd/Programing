package String1;

import java.util.Scanner;

public class PalindromeSIx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int c=0;
		for(int i=0;i<s.length();i=i+6) {
			String t=s.substring(i, i+6);
			if(Palindrome.isPalindrom(s)) {
				c++;
			}
		}
		if(c==s.length()/6) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
