package org.lessons.java.security;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i= 1; i <= 100; i++ ) {
			
			
			if ( (i % 3 == 0) && (i % 5 == 0) ) { //Stampo i numeri multipli di 3 e 5
				
				System.out.println("FizzBuzz");
				
			} else if (i % 3 == 0) {			//Stampo i numeri multipli di 3
				
				System.out.println("Fizz");				
				
			} else if (i % 5 == 0) {		//Stampo i numeri multipli di 5
				
				System.out.println("Buzz");
				
			}else {
				
				System.out.println(i);
				
			}
		};

	}

}
