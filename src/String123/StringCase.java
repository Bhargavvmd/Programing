package String123;

import java.util.Scanner;

public class StringCase {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine();
	//	caseConvertion(s);
		String res1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)>=90 && s.charAt(i)>=97 && s.charAt(i)>=122) {
				res1 +=s.charAt(i);
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(res1);
	}
	private static void caseConvertion(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			//A=65 & Z=90;+32 is used to convert Uppercase to Lowercase
			//a=97 & z=122;_32 is used to convert the lowerCase to upperCase
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				res +=(char)(s.charAt(i)+32);
			}else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				res +=(char)(s.charAt(i)-32);
			}else {
				res +=s.charAt(i);
			}
		}
		System.out.println(res);
		System.out.println(s.substring(0, 1).toLowerCase()+""+s.substring(1,s.length()).toUpperCase());
	}

}
