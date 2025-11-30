package com.example;

import java.util.ArrayList;
import java.util.Collections;

import com.example.entity.Employee;

public class CompaObj {

	public static void main(String[] args) {
		
            ArrayList<Employee> al=new ArrayList<Employee>();
            al.add(new Employee(121,"Aryan"));
            al.add(new Employee(127,"Zeon"));
            al.add(new Employee(125,"Sammer"));
            al.add(new Employee(122,"Emam"));
            al.add(new Employee(126,"Ganesh"));
            
            Collections.sort(al);
       
        for(Employee e:al) {
        	
        	System.out.println(e.id+" "+e.name+" ,");
        	
        }
      
            
	}
}
