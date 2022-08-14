package Basics;

public class Students {

	//Properties
	
	/*
	 * Types of Variables
	 * 1. Global: variables which are declared inside the class but outside of any method
	 * 		1. Instance:  global variables without static keyword
	 * 		2. Static: global variables with static keyword
	 * 2. Local: variables which are declared inside a method
	 * 
	 * Types of Methods:
	 * 1. Instance Methods: if method is accessing instance variables
	 * 2. Static Methods: if method is accessing only static variables or no variables
	 * 
	 */
	int studentId;
	int age;
	String studentName;
	int rollNo;
	String address;
	char gender;
	long mobileNo;
	float percentage;
	
	static String schoolName;
	
	
	public void showStudentName() {
		System.out.println(studentName);
		System.out.println(schoolName);
		//showInfo?
		showInfo();
	}
	
	public static void showSchoolName() {
		System.out.println(schoolName);
		//showinfo?
		showInfo();
		//System.out.println(id);
		//showstudentName?
		
	}
	
	public static void showInfo() {
		int id = 4;
		System.out.println(id);
		System.out.println("This is just an info");
	}
	
	
	//Behaviors
	public void attendLectures(int id) {
		int a;
		//method area
	}
	
	public void giveExams() {
		
	}
	
	public void doExercise() {
		
	}
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.studentName = "Rashid";
		System.out.println(s1.studentName);
		
		Students s2 = new Students();
		s2.studentName = "Charu";
		System.out.println(s2.studentName);
		
	}
	
	
	
	//Types of Variables and Method, static, Constructors
	
}
