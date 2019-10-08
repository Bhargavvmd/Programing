package com.hpe.arrays;

public class MAxMIN {
	
	public static void main(String[] args) {
		String s="rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
	        int h1=1;int a1=2;int c1=1;int e1=1;int k1=2;int n1=1;int r1=2;
	        int h2=0;int a2=0;int c2=0;int e2=0;int k2=0;int n2=0;int r2=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='h')
	            h2++;
	            else if(s.charAt(i)=='a')
	            a2++;
	             else if(s.charAt(i)=='c')
	             c2++;
	              else if(s.charAt(i)=='e')
	              e2++;
	               else if(s.charAt(i)=='k')
	               k2++;
	               else if(s.charAt(i)=='n')
	               n2++;
	                else if(s.charAt(i)=='r')
	                r2++;
	        }
	        System.out.println("h="+h2);
	        System.out.println("a="+a2);
	        System.out.println("c="+c2);
	        System.out.println("e="+e2);
	        System.out.println("k="+k2);
	        System.out.println("n="+n2);
	        System.out.println("r="+r2);
	        if(h2>=h1&&a2>=a1&&c2>=c1&&e2>=e1&&k2>=k1&&n2>=n1&&r2>=n1){
	           System.out.println( "YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
}
