package InheritanceDemo;

public class InheritanceDemoNotes {

	/*
	 * OOPS
	 * OOPS is a paradigm of principles
	 * 
	 * Object class is parent class of all the classes
	 * 
	 * 1. Class
	 * 2. Object
	 * 3. Inheritance
	 * 4. Polymorphism
	 * 5. Abstraction
	 * 6. Encapsulation
	 * 
	 * 
	 * Inheritance:
	 * to inherit some properties from our parent
	 * sole purpose is re usability of code
	 * 
	 * 1. We can move common methods to base class or parent class
	 * 2. we can also define child class specific methods
	 * 3. extends keyword is used to define relationship of parent and child class
	 * 4. Using child class object we can access child class methods as well as Parent class methods
	 * 5. Using parent class object we can only access parent class methods and not child class methods
	 * 6. Child class can create there own method also
	 * 
	 * 
	 * Polymorphism:
	 * poly? many or multiple
	 * morph: forms
	 * 
	 * 2 types:
	 * 1. Compile Time - Static - Method Overloading
	 * 2. Run Time - Dynamic - Method Overriding
	 * 
	 * Execution Flow In case of Dynamic Polymorphism
	 * 1. It will check the class name
	 * 2. Go to the class and search for that method
	 * 3. If method present
	 * 		a. Yes, execute the method
	 * 		b. No, go to the parent class and repeat Step 2 again
	 * 4. If the method is not present in any class, it will search in Object Class
	 * 
	 * Parent: Business
	 * Toronto
	 * 
	 * Project for Hospital Management
	 * 
	 * 
	 * Types of Inheritance
	 * 
	 * 1. Single Inheritance
	 * P --> C
	 * P --> C1, C2
	 * 
	 * 2. Multi-Level Inheritance
	 * GP(2M) --> P(3M) --> C(4M)
	 * 
	 * 3. Multiple Inheritance(Not possible in JAVA by classes, can be achived by Interfaces)
	 * P1, P2 --> C
	 * 
	 * P1 - m1 and m2
	 * P2 - m1 and m3
	 * 
	 * Child: m1 and m2, m2 of P1 and m3 of P2
	 * Object of Child class: O1
	 * O1.m2 - fine
	 * O1.m1 - ambiguity 
	 * 
	 * 
	 * Common CLass:
	 * markAttendance() - 100 LOC
	 * 
	 * 
	 * Doctors
	 * perform surgery()
	 * 
	 * Nurses
	 * performDressing
	 * 
	 * Support
	 * Movement
	 * 
	 * OfficeStaff
	 * admin
	 * 
	 * ConsultantDoctor
	 * 
	 * 
	 * 
	 * 
	 */
}
