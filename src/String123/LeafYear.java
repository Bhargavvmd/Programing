package String123;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the year :");
		int year = scan.nextInt();
	
		if(year%4==0) {
			System.out.println("given year "+year+" is a leap year");
		}else {
			System.out.println("given year "+year+" is a not leap year");
		}
		
	}

}
