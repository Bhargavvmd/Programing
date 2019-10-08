package String123;

import java.util.Scanner;

public class NoOvels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the vale of String = ");
		String s = scan.nextLine();
		int count=0;
		int consoents=0;
		int a=0;
		int e=0;
		int j=0;
		int u=0;
		int o=0;
		for(int i=0;i<s.length();i++) {
			
			switch (s.charAt(i)) {
			case 'a':
				count++;
				
				break;
			case 'e' :
				count++;
				break;
			case 'i' :
				count++;
				break;
			case 'o' :
				break;
			case 'u' :
				count++;
				break;
			default :
				if(s.charAt(i)!=' ') {
					consoents++;
				}
				break;
			}
			}
		System.out.println("the no of Oveles "+count);
System.out.println("the no of consoents "+consoents);
		}
}
