package com.abhi.hashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("Abhi", 30);
		Employee e2 = new Employee("Abhi", 30);
		
		System.out.println(e1.equals(e2));
		
		Set<Employee> hashSet = new HashSet<>();
		hashSet.add(e1);
		hashSet.add(e2);
		
		System.out.println(hashSet.size()); //this gives size as 2 , as hash code is not overriden
		
		
	}

}
