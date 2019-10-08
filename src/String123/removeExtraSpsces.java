package String123;

import java.util.Scanner;

public class removeExtraSpsces {
	static String fhalf = "";
	static String Shos="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine();
		int c = 0;
		
		scecondHalf(s);
		
		secondHalfResverse();

		middleCharcter(s);

		removeSpaces(s);

		firstHalfOfString(s);

		reverse1Sh();
	}

	private static void secondHalfResverse() {
		String Rshos="";
		for (int i = removeExtraSpsces.Shos.length() - 1; i >= 0; i--) {
			 Rshos += removeExtraSpsces.Shos.charAt(i);
		}
		System.out.println(Rshos);
	}

	private static void scecondHalf(String s) {
		
		for (int i = s.length()/2; i <s.length() ; i++) {
			Shos += s.charAt(i);
		}
		System.out.println(Shos);
	}

	private static void middleCharcter(String s) {
		int i = s.length();
		System.out.println(s.charAt(i / 2));
	}

	static void reverse1Sh() {
		String s1 = removeExtraSpsces.fhalf;
		String reverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverse += s1.charAt(i);
		}
		System.out.println(reverse);
	}

	static String firstHalfOfString(String s) {

		for (int i = 0; i < s.length() / 2; i++) {
			fhalf = fhalf + s.charAt(i);
		}
		System.out.println(fhalf);
		return fhalf;
	}

	private static void removeSpaces(String s) {
		String o = "";
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')) {
				o = o + s.charAt(i);

			} else {

			}
		}
		System.out.println(o);
	}
}
