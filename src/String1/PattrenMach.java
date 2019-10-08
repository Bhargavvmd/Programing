package String1;

import java.util.regex.Pattern;

public class PattrenMach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pattern pattern = Pattern.compile("[A-z]");
		 System.out.println(pattern.matches("bhargav","bhargav"));
		 System.out.println(pattern.matcher("bhargav"));
		 
	}

}
