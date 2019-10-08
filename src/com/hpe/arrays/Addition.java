package com.hpe.arrays;

public class Addition {
	 
	 int add(int x,int y) {
		return x+y;
		
	}
	static float add(float x,float y) {
		return x+y;
		
	}
	public static void main(String[] args) {
		Addition ad=new Addition();
		
		int a=ad.add(5,7);
		
		System.out.println(a);
		float b=add(5.6f,7.7f);
		System.out.println(b);
	}
	
}
