package String1;

public class ReverseTheWords {
	public static void main(String[] args) {
		
		
		String s = "jack and jill";
		boolean b[] = new boolean[5];
		// int words=NoWords(s);

		String Ar[] = new String[NoWords(s)];
		toCharArra(s, Ar);
		String A[]=s.split(" ");
		
		reverseTheWords(A);
		
		//reveserWordsString(Ar);
	}
  
	private static void reveserWordsString(String[] Ar) {
		String t1 = "";
		for (int i = 0; i < Ar.length; i++) {

			for (int j = Ar[i].length() - 1; j >= 0; j--) {
				String ss = Ar[i];

				t1 = t1 + ss.charAt(j);
			}
			t1 += " ";
		}
		System.out.println(t1);
	}

	private static void reverseTheWords(String[] Ar) {
		for (int i = Ar.length - 1; i >= 0; i--) {
			System.out.println(Ar[i]);
		}
	}

	private static void toCharArra(String s, String[] Ar) {
		String temp = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				temp += s.charAt(i);
			} else {
				Ar[j] = temp;
				j++;
				temp = "";
			}
			Ar[j] = temp;
		}
		for (String str : Ar) {
			System.out.println(str);
		}
	}

	private static int NoWords(String s) {
		int words = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				words += 1;
			}

		}
		return words;
	}

}
