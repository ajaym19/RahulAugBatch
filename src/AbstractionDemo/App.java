package AbstractionDemo;

public class App {

	public static void main(String[] args) {
		//RBI obj = new RBI();
		
		//ICICIBank bankObj = new ICICIBank();
		RBI bankObj = new ICICIBank();
		
		bankObj.depositMoney();
		bankObj.intraDayTrading();
		bankObj.m1();
		
	}
}
