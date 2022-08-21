package InheritanceDemo;

public class App {

	public static void main(String[] args) {
		Doctors doc = new Doctors();
		doc.markAttendance();
		doc.performSurgery();
		
		Staff s1 = new Staff();
		s1.markAttendance();
		
		//s1.performSurgery(); not possible
		
		//can I create an object of Parent class?
		Parent p = new Parent();
		p.markAttendance();
		
		s1.hashCode();
		
		
		
	}
}
