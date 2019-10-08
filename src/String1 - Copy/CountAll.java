package String1;

public class CountAll {

	public static void main(String[] args) {
		
		String s="AEIOUaeiouaeiouXYZXYZxyzxyz123456789@#$*&* @#";
		
		countAll(s);
	}

	private static void countAll(String s) {
		int uco=0;
		int lco=0;
		int ucc=0;
		int lcc=0;
		int n=0;
		int sc=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='A' ||c=='E' ||c=='I' || c=='O' ||c=='U') {
				uco++;
			}
			else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				lco++;
			}
			else if(c>='A'&&c<='Z') {
				ucc++;
			}
			else if(c>='a'&&c<='z'  ){
				lcc++;
			}
			else if(c>'0'&&c<'9') {
				n++;
			}
			else {
				sc++;
			}
		}
		System.out.println("the no of UCO "+uco);
		System.out.println("the no of LCO "+lco);
		System.out.println("the no of ucc "+ucc);
		System.out.println("the no of lcc "+lcc);
		System.out.println("the no of n "+n);
		System.out.println("the no of sc "+sc);
	}

}
