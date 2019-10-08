package String1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class NewStr {
	public static void main(String[] args) {
		System.out.println("enter the String : ");
		String s=new Scanner(System.in).nextLine();
				char[] c=s.toCharArray();
		Map<Character,Integer> hash=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(hash.containsKey(c[i])) {
			hash.put(c[i], hash.get(c[i])+1);
		}
			else {
				hash.put(c[i], 1);
			}
			//System.out.println(hash);
		}
		Set<Entry<Character, Integer>> values=hash.entrySet();
		 for (Entry<Character, Integer> entry : values) {
			 if(entry.getValue()>1)
			 System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

}
