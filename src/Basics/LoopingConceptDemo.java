package Basics;

public class LoopingConceptDemo {

	public static void main(String[] args) {

		// For Loop: used to execute same code again and again
		/*
		 * 3 parameters 1. Init 2. Conditional Check 3. Increment/decrement operator
		 * 
		 */

		// print nos from -1 to 10s

		for (int i = 1; i <= 10; i++) {
			// 1, 2 , 3....10, 11
			// System.out.println(i);
		}

		// print nos from 10 to 1
		for (int i = 10; i >= 1; i--) {
			// System.out.println(i);
		}

		/*
		 * print 1 to 10 times if i is 2, then instead of i , print AJay if i is 5, then
		 * instead of i , print Teena
		 * 
		 */
		for (int i = 1; i < 11; i++) {
			if (i == 2) {
				// System.out.println("Ajay");
			} else if (i == 5) {
				// System.out.println("Teena");
			} else {
				// System.out.println(i);
			}
		}

		// System.out.println("Lerning if else");
		int j = 2;
		if (j == 1) {
			// System.out.println("Ajay");
		} else {
			// System.out.println("Teena");
		}

		// print 1 to 10,
		// if found 5 stop, and also skip 5
		for (int i = 1; i < 11; i++) {

			if (i == 5) {
				break;
			}
			// System.out.println(i);
		}

		// print 1to 10, if i is 4, then skip 4
		for (int i = 1; i < 11; i++) {

			if (i == 4) {
				continue;
			}
			// System.out.println(i);
		}

		/*
		 * for (all the students in line){ if student already has ID card continue;
		 * ..issue ID card }
		 * 
		 * 
		 * 
		 * for(to all the students) If(chocolate is over){ break; }
		 */

		// while loop
		int k = 21;
		while (k <= 10) {
			System.out.println(k); // 21
			k++;
		}

		/*
		 * apple = 1 while(bag has apples) keep on applying labels
		 */

		int z = 21;
		do {
			// System.out.println(z);
			z++;
		} while (z <= 10);

		// Switch
		// print day name against day number
		// if day = 1, print Monday ...
		// Try with else if

		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");

		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter number between 1 to 7");
			break;

		}

		// for each/enhanced for loop

	}
}
