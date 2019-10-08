package String123;

import java.util.Scanner;

public class RemoveSC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine();
		String res="";

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)>=90 || s.charAt(i)>=97 && s.charAt(i)>=122) {
				res =res+s.charAt(i);
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(res);
		int[] i= {1,2,3,4,5,6,7};
		System.out.println(i.length);
	}
}
