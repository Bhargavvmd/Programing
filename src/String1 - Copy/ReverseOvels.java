package String1;

public class ReverseOvels {
	static boolean isVowel(char c) { 
		return (c == 'a' || c == 'A' || c == 'e'
				|| c == 'E' || c == 'i' || c == 'I'
				|| c == 'o' || c == 'O' || c == 'u'
				|| c == 'U'); 
	} 

	// Function to reverse order of vowels 
	static String reverseVowel(String str1) { 
		int j = 0; 
		// Storing the vowels separately 
		char[] str = str1.toCharArray(); 
		String vowel = ""; 
		for (int i = 0; i < str.length; i++) { 
			if (isVowel(str[i])) { 
				j++; 
				vowel += str[i]; 
			} 
		} 

		// Placing the vowels in the reverse 
		// order in the string 
		for (int i = 0; i < str.length; i++) { 
			if (isVowel(str[i])) { 
				str[i] = vowel.charAt(--j); 
			} 
		} 

		return String.valueOf(str); 
	} 

	// Driver function 
	public static void main(String[] args) { 
		String str = "BuCo2I1EsA"; 
		System.out.println(reverseVowel(str)); 
		System.out.println(rs("bharaeiou"));
	} 
	public static boolean vol(char c) {
		return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
	}
	public static String rs(String s) {
		
		int j=0;
		String vo="";
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(vol(c[i])) {
				vo+=c[i];
				j++;
			}
		}
		for(int i=0;i<c.length;i++) {
			if(vol(c[i])) {
				c[i]=vo.charAt(--j);
				
			}
		}
		return c.toString();
	}
}
