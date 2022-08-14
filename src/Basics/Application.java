package Basics;

public class Application {

	public static void main(String[] args) {
		//Class reference_variable = new_keyword constructor
		Employee emp1 = new Employee(1, "Ajay");
		System.out.println("Emp1 details: ");
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.aadharNumber);
		
		Employee emp2 = new Employee(2, "Tanu", 2323);
		System.out.println("Emp2 details: ");
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(emp2.aadharNumber);
		
		
		
	}
}
