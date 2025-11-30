package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable {

	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Ram");
		a.add("parth");
		a.add("jaideep");
		a.add("zesus");
		System.out.println("Before sort"+a);
		Collections.sort(a);
		System.out.println("After sort"+a);
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(21);
		al.add(8);
		al.add(45);
		System.out.println("Before sort"+al);
		Collections.sort(al);
		System.out.println("After sort"+al);
		
		

	}

}
