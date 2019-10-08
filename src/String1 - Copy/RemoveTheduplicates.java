package String1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveTheduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String s = "i am bhargav siphi opiji bhargav";
		String[] s1 = s.split(" ");
		System.out.println(s1[2]);
		Set set = new LinkedHashSet();
		for (String r : s1) {
			
			set.add(r);
		}
		System.out.println(set.toString());
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
