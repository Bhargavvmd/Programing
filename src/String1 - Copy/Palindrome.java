package String1;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
	//	Scanner scan =new Scanner(System.in);
		//String s=scan.next();
//		boolean res=solution(s);
		if(isPalindrom(new Scanner(System.in).next())) {
			System.out.println("panlindrome");
		}
		else {
			System.out.println("not polindrome");
		}
		new Scanner(System.in).close();
	}

	public static boolean isPalindrom(String s) {
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j))
			return false;
		}
		return true;
	} 
}
