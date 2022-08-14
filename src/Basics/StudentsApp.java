package Basics;

public class StudentsApp {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.studentName = "Raj";
		s1.schoolName = "IIT";
		System.out.println(s1.schoolName);
		Students s2 = new Students();
		s2.studentName = "Astha";
		s2.schoolName = "London School";
		
		System.out.println(s1.studentName);
		System.out.println(s1.schoolName);
		
		System.out.println(s2.studentName);
		System.out.println(s2.schoolName);
		
		
		
	}
}
