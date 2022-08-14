package Basics;

public class Employee {

	/*
	 * Constructor: it is used to initialize your variables should be of same name
	 * as class name
	 * 
	 * 2 types 1. Non parametrized 2. parametrized
	 * 
	 */

	int empId;
	String empName;
	int aadharNumber;
	
	public Employee(int empId, String empName) {
		//over here, there are 2 variables with same name
		this.empId = empId;
		//empId = empId;
		this.empName = empName;
	}

	public Employee(int empId, String empName, int aadharNumber) {
		this.empId = empId;
		this.empName = empName;
		this.aadharNumber = aadharNumber;
	}

	public void info() {
		System.out.println("Hello");
	}

}
