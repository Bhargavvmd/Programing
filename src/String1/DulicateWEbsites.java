package String1;

import java.util.Scanner;
import java.util.TreeSet;

public class DulicateWEbsites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of websites entering : ");
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
		
			ts.add(scan.nextLine());
		}
	
		for( Object temp : ts) {
			 System.out.println(temp);
		}
	}

}
