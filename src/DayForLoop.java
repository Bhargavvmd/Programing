import java.util.Scanner;

public class DayForLoop {
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			System.out.print("*");
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("*");
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the vales of integers");
		int k=scan.nextInt();
		int l=scan.nextInt();
		System.out.println("sum of integers "+(k+l));
		
		System.out.println("enter the vales of floats");
		float f=scan.nextFloat();
		float g=scan.nextFloat();
		System.out.println("sum of float values"+(f+g));
		
		for (int i=0;i<5;i++) {
			System.out.print("hello");
			i++;
		}
		System.out.println();
		
		for (int i=0;i<10;i=i+3) {
			System.out.print("*");
			i--;
		}
		System.out.println();
		
		for (int i=10;i>=2;i--) {
			i=i-1;
		}
		System.out.println();
		
		for (int i=5;true;i--) {
			System.out.print("hellow");
			break;
		}
		System.out.println();
		
		/*for(;;) {
			System.out.println("ABC");
		}*/
	/*	for(int abc=0;abc<3;abc--,abc++) {
			System.out.println("abc");
		}*/
	
	}
}
