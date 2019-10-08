package String123;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine().toString();
		String e = "";
		String o = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				e = e + s.charAt(i);

			} else {
				o = o + s.charAt(i);
			}

		}
		System.out.println("print the even places "+e);
		System.out.println("print the odd places "+o);
		
		
	}

}
