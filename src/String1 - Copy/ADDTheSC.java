package String1;

import java.util.Scanner;

public class ADDTheSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(addSpecialCharacters(str));
	} 

	private static String addSpecialCharacters(String str) {
		String res="";

		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='u'
					|| c=='A' ||c=='E' ||c=='I' || c=='O' ||c=='U') {
				res+="*"+str.charAt(i);
			}
			
			else {
				res+=str.charAt(i);
			}
		}

		return res;
	}
}
