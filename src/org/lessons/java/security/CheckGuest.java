package org.lessons.java.security;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		//Lista ospiti
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis, Pardis Zarei", "Martina Maccherone", "Rachel Zeili"};
		
		Scanner inputName = new Scanner(System.in);	
		
		// Chiedo all'ospite il suo nome
		System.out.print("Dimmi il tuo nome: ");
		String nameGuest = inputName.nextLine();
		
		boolean isPresent = false;
		
		//Controllo se il nome è presente nella lista
		for (int i = 0; i <= guests.length; i++) {
			if(Arrays.asList(guests).contains(nameGuest)) {
					isPresent = true;
			};
		};
		
		if (isPresent) {
			System.out.println("Ciao " + nameGuest + ", puoi entrare!");			
		} else {
			System.out.println("Ciao " + nameGuest + ", non sei nella lista, non puoi entrare!");
		}
		
		};

}
