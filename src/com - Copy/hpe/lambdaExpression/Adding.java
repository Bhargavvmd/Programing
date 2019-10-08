package com.hpe.lambdaExpression;

import java.awt.List;
import java.util.ArrayList;

interface Add{
	public void add(int x,int y);
}


public class Adding {
	public static void main(String[] args) {
		Add a=(x,y)-> System.out.println((x+y));
		a.add(10,30);
		a.add(2, 3);
		
		ArrayList<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
        
        list.forEach((n)->System.out.println(n)
        		);
	}

}
