package EncapsulationDemo;

public class App {

	public static void main(String[] args) {
		Employees e1 = new Employees();
//		e1.name = "W2A";
//		System.out.println(e1.name);
		
		System.out.println(e1.getEmpid());
		System.out.println(e1.getName());
		e1.setName("Ajay");
		System.out.println(e1.getName());
		
		
	}
}
