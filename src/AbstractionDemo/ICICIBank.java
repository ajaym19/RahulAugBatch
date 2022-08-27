package AbstractionDemo;

public class ICICIBank extends ParentDemo implements RBI, SEBI {

	public void depositMoney() {
		System.out.println("ICICI Depositing Money");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI Bank Withdrawing Money");

	}

	@Override
	public void intraDayTrading() {
		System.out.println("ICICI Intra Day Training");

	}

	@Override
	public void regularTrading() {
		System.out.println("ICICI Regular Day Training");

	}

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

}
