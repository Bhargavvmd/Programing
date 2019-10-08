package String1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AllStringForm {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of string : ");
		String s=scan.nextLine();
		sortedForm(s);
		insertionOrder(s);
		duplicatesWithInsertionOrder(s);

		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] ch=s.toCharArray();
		
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> es=hm.entrySet();
		for(Map.Entry<Character, Integer> entry:es) {
			if(entry.getValue()>1)
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	//	System.out.println(hm);
	}
	
	

	private static void duplicatesWithInsertionOrder(String s) {
		ArrayList swd=new ArrayList<>();
		System.out.println("elements in duplicatesWithInsertionOrder form :  ");
		for(int i=0;i<s.length();i++) {
			swd.add(s.charAt(i));
		}
		Collections.sort(swd);
		
		
		for (Object object : swd) {
			
			System.out.print(object);
		}
		System.out.println();
	}

	private static void insertionOrder(String s) {
		LinkedHashSet io=new LinkedHashSet();
		System.out.println("elements in insertionOrder form :  ");
		for(int i=0;i<s.length();i++) {
			io.add(s.charAt(i));
		}
		for (Object object : io) {
			
			System.out.print(object);
		}
		System.out.println();
	}

	private static void sortedForm(String s) {
		TreeSet ts=new TreeSet();
		System.out.println("elements in sorted form :  ");
		for(int i=0;i<s.length();i++) {
			ts.add(s.charAt(i));
		}
		for (Object object : ts) {
			
			System.out.print(object);
		}
		System.out.println();
	}

}
