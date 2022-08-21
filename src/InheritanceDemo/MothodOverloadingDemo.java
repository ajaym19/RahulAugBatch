package InheritanceDemo;

public class MothodOverloadingDemo {
	
	/*
	 * Method Overloading
	 * same method with same name but different behavior
	 * 
	 * can be achieved in 2 ways
	 * 1. by changing the no of parameters
	 * 2. By changing the data type
	 * 
	 * Note: Not possible by changing the return type
	 * 
	 */
	
	
	public void info() {
		
	}
	
	public void add(int num1, int num2) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void add(float a, float b) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println("Adding 2 int numbers");
	}
	
	public int returnSum() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		return sum;
	}
	
//	public void returnSum() {
//		int a = 10;
//		int b = 20;
//		int sum = a+b;
//	}
//	
	/*
	 * Tripti
	 * H1 
	 * returning me Apple
	 * 
	 * Shivani
	 * H1
	 * returning me Orange
	 */
	
	
	
	
	
	
}
