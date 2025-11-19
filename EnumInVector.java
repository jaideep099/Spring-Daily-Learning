//hasMoreElement()  //nextElement()

package com.example;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumInVector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("rofan");
		v.add("Kaka");
		v.add("Mahi");
		v.add("Rahi");

		// normal without generics
		Enumeration e =v.elements();
		while(e.hasMoreElements()) {
			
			 String s =(String)e.nextElement();
			 System.out.println(s);
		}
		
		// with generics

		Enumeration<String> e1 = v.elements();
		while(e1.hasMoreElements()) {
			
			String ss= e1.nextElement();
			System.out.println(ss);
		}
		
		System.out.println(Arrays.toString(v.toArray()));
		
	}

}
