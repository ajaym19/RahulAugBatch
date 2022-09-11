package EncapsulationDemo;

public class Employees {

	/*
	 * Encapsulation:
	 * we are trying to hide the data
	 * wrapping the data with methods
	 * Access Modifier is applied
	 * also called as getter and setter concept
	 * 
	 * private: can be accessed within the class
	 * protected: can be accessed within the package, and outside the package only for child class
	 * default: only within the package
	 * public: across the project
	 * 
	 */
	
	private int empId; //read - yes, write- no
	private String dept; //read - yes, dept - no
	private String name; // read - yes, update - yes
	private char gender; // read - yes, update - yes
	private long mobile; //read - yes, updated - yes
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getEmpId() {
		return empId;
	}
	public String getDept() {
		return dept;
	}
	
	
//	public void setName(String name) {
//		//checks
//		/*
//		 * if there is an update in phone number
//		 * if OTP matches the system
//		 * only then update the mobile number
//		 * else dont update
//		 */
//		this.name = name;
//	}
//	
	
	
	
	
	
}
