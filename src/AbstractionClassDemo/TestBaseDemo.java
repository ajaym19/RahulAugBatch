package AbstractionClassDemo;

public abstract class TestBaseDemo {

	/*
	 * Abstract CLass
	 * 
	 * can contain both regular and abstract methods also
	 * 
	 * box - contains apples
	 * box - contains apples and oranges
	 * 
	 * Notes:
	 * 1. cannot create object of abstract class
	 * 2. We need to use abstract keyword for class and methods
	 * 3. It can contain both regular and abstract methods also
	 * 4. It is the responsibility of the child class to implment the abstract methods
	 * 
	 * 
	 * Percentage of Abstraction achieved?
	 * Interface:  100%
	 * Abstract class: 0 to 100%
	 * 
	 */
	
	public void depositMoney() {
		System.out.println("Deposit");
	}
	
	public void withDrawMoney() {
		System.out.println("Withdrawing");
	}
	
	public abstract void SavingROI();
	
	public abstract void FDROI();
	
}
