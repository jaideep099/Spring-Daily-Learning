// using hasNext(),next()
package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraCursor {

	public static void main(String[] args) {
	
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("rofan");
		al.add("Kaka");
		al.add("Mahi");
		al.add("Rahi");
		
		//without generics you have to typecast int the string beacuse iterator can read all the data in the object class which contains different type of elements
		Iterator i = al.iterator();
		while(i.hasNext()) {
			
		String s =(String)i.next();
		System.out.println(s);
		}
		//with generics its typesafe already
		Iterator<String> i1 = al.iterator();
		while(i1.hasNext()) {
			
			String s1 = i1.next();
			System.out.println(s1);
			
		}
		

	}

}
