package String1;

import java.util.Scanner;

public class InsertingAStringInsideAString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int n=scan.nextInt();
		scan.nextLine();
		String s=scan.nextLine();
		String res="";
//		System.out.println(str.substring(0, 4)+""+scan.next()+""+str.substring(4));
		subStrings(str, n, s, res);
	}

	private static void subStrings(String str, int n, String s, String res) {
		for(int i=0;i<str.length();i++) {
			if(i==n) {
				res+=s+str.charAt(i);
			}
			else {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
