package AbstractionDemo;

public class AbstractionNotes {

	/*
	 * Abstract:
	 * idea with no concrete information
	 * 
	 * We are trying to hide the code
	 * 
	 * Can be achieved in 2 ways
	 * 1. By Interface
	 * 2. By Abstract class
	 * 
	 * Note:
	 * 1. Implements keyword is used in Interfaces
	 * 2. Methods in the interface will not have any body
	 * 3. We can achieve multiple inheritance by Interfaces
	 * 4. Cannot create object of Interfaces
	 * 5. Interface can contain only abstract methods
	 * 
	 * Situation:
	 * 
	 * 5 methods are common
	 * 2 methods are dependent on the child class
	 * 
	 * Abstract Class
	 * 
	 * Why Multiple inheritance is allowed in Interfaces?
	 * 
	 * Selenium?
	 * 
	 * webdriver --> Interface
	 * m1, m2, m3
	 * 
	 * browsers?
	 * 
	 * Chrome class
	 * m1, m2, m3
	 * 
	 * IE class
	 * m1, m2, m3
	 * 
	 * Firefox
	 * 
	 * 10 browser
	 * 
	 * Interface
	 * m1, m2,m3
	 * 
	 * child1
	 * m1,m2, m3 m4, m5
	 * 
	 * child2
	 * m1, m2, m3, m6, m7
	 * 
	 * child1 c1 = new child1();
	 * c1 can call 5 methods
	 * 
	 * Interace c1 = new CHild1()
	 * c1 can call only 3 methods
	 * 
	 * 
	 * webdriver - Interface
	 * m1, m2 , m3
	 * 
	 * Chrome - class
	 * m1, m2, m3 , m4, m5
	 * 
	 * IE - CLass
	 * m1, m2, m3, m8, m9
	 * 
	 * 
	 * //Chrome browser = new Chrome();
	 * 
	 * IE browser = new IE();
	 * 
	 * webdriver browser = new IEDRiver();
	 * 
	 * browser.m1();
	 * browser.m2();
	 *
	 *
	 *	Parent class
	 *	m1,m2,m3
	 *Child class
	 * m4,m5
	 * 
	 * create an below object and see which and how many method can we call
	 * Parent p = new Parent()
	 * Child c = new CHild()
	 * parentp = new Child()
	 * Child c = new Parent()
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
