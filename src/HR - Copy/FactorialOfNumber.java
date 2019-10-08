package HR;

public class FactorialOfNumber {

	

	public static void main(String[] args) {
		for (int i=2;i<10;i++) {
		System.out.println(fact(i));
		}
		primeNo();
	}

	private static void primeNo() {
		for(int i=1;i<=100;i++) {
			int c=0;
			for(int n=1;n<=i;n++) {
				if(i%n==0) {
					c=c+1;
				}
			}
			if(c==2) {
				System.out.print(i+",");
			}
		}
	}

	private static int fact(int i) {
		if(i==0 || i==1) {
			return 1;
		}
		return i*fact(i-1);
	}

	
}
