package String1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountOfDuolicates {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		printDuplicateCharacters(scan.nextLine());

	}

	/*
	 * Find all duplicate characters in a String and print each of them.
	 */
	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();

		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		// Iterate through HashMap to print all duplicate characters of String
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.println("List of duplicate characters in String ");
		/*Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}*/
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() >1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	}
}
