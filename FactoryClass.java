package com.technoelevate.java.mondayassignment;



public class FactoryClass  {
	Employee employee=null;
	
	public Employee getEmployee(String name) {
		if(name.equalsIgnoreCase("Avinash")) {
			employee = new Avinash();
		}else if(name.equalsIgnoreCase("Dhananjay")) {
			employee = new Dhananjay();
		}else if(name.equalsIgnoreCase("Nitish")) {
			employee = new Nitish();
		}else 
		{
			name.equalsIgnoreCase("Venkatesh");
			employee = new Venkatesh();
		}
		return employee;
	}
	

}
