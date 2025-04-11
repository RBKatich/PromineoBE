package Week2;

public class Week2CondititonsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Boolean Operators 	
		
	// == equality operator
		System.out.println(2==2);
	
		System.out.println(2 > 5);
		
		System.out.println(3 <= 5);
		
		System.out.println(5 <= 5);
		
	//&& and || or
		
		System.out.println(2 == 2 && 1 < 5);
		
		System.out.println(true && true);
		
		System.out.println(true && false);
		
		System.out.println(true || false);
		
		System.out.println(false || false);
		
		System.out.println(2 == 2 || 1 == 5);
		
		System.out.println(2 == 2 && 1 == 5);
		
		
		
		
		
//Conditionals
		
	
		String name = "Sam";
	
			if (name == "Sam") {
			System.out.println("Hello Sam!");
	
	//it wont print anything if the name doesn't match 
		String name2 = "Tom";
		
			if (name2 == "Sam") {
			System.out.println("Hello Sam!");
	
	//else statement 
			} else { 
				System.out.println("You are not Sam, " + name2 + ".");
			}
		
		
			
			
	// drivers license example
		int age = 15;	
			
		if (age >= 16) {
			System.out.println("You can get your license!");
	
		} else { 
			System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");
		}
	
		
		
		
	//buying milk example 
		double costOfMilk = 2;
		
		if (costOfMilk <= 2 ) {
			System.out.println("Buying 2.");
			
		} else if (costOfMilk <= 3) {
		System.out.println("Buying 1.");
	
		} else {
			System.out.println("Not buying any milk.");
		}
		
		
	//grading example 
		char grade = 'A';
		
		switch (grade) {
		
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
				//without the break, it will show multiple answers, cascading values
			
		}
		
		if (5==5) {
			if (4 == 3) {
				System.out.println("5 is 5 and 4 is 4");
			
			} else { 
				System.out.println("5 is 5");
			}
		}
			
		if (5 == 5 && 4 == 4) { 
			System.out.println("yes");
		}
			
			}
			//Loops
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			} 
			
			for (int i = 0; i < 100; i ++) {
				if (i % 2 == 0) {	
					System.out.println(i);
		}
				
	}
			int x = 10;
			while (x < 10 ) {
				System.out.println(x);
				x++;
			}
			
			do {
				System.out.println(x);
				x++;
				
			} while (x < 2);	
			
			 
		
					
					
				
	}
	
}

































