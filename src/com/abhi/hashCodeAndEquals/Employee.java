package com.abhi.hashCodeAndEquals;

public class Employee extends Object {

	public String name;
	public Integer age;
	
	public Employee(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		if(o == null || this.getClass() !=  o.getClass())
			return false;
		
		if(this == o)
			return true;
		
		Employee emp = (Employee) o;		
		
		return name.equals(emp.name) && age.equals(emp.age);
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}
