package String123;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mississippi";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
	r=	r+(s.charAt(i));
		}
		System.out.println("   "+r);
	}

}
