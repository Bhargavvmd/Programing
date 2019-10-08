package man;

import java.util.Scanner;

public class patren1 {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        string(A);
            }
        /* Enter your code here. Print output to STDOUT. */
        private static void string (String input)
        {
            String result="Yes";
            int length=input.length();
            for(int i=0;i<length/2;i++)
            {
                if(input.charAt(i) !=input.charAt(length-i-1))
                    
                {
                    result="No";
                    System.out.println(input.charAt(i));
                    break;
                }
            }    
            System.out.println(result);
        }
	}

