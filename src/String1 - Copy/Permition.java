package String1;

import java.util.Scanner;

public class  Permition { 
    public static void main(String[] args) 
    { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter the String : ");
        String str =scan.nextLine(); 
        scan.close();
        int n = str.length(); 
        Permition permutation = new  Permition(); 
        permutation.permute(str, 0, n - 1); 
    } 
  
    /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
               permute(str, l + 1, r); 
               str = swap(str, l, i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
} 
  


