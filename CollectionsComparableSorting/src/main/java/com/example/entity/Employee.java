package com.example.entity;

public class Employee implements Comparable<Employee>{

	public int id;
	public String name;
	
	public Employee(int id,String name){
		this.id= id;
		this.name= name;
	}

	@Override
	public int compareTo(Employee e) {
		
		
		return name.compareTo(e.name);
	}

	// without generic version
//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		if(id==e.id)
//			return 0;
//		else if(id>e.id)
//			return 1;
//		else
//			return -1;
//	}
	
	
}
