package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String nameUser;
		String surnameUser;
		String colorUser;
		int dayOfBirthUser;
		int monthOfBirthUser;
		int yearOfBirthUser;
		
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Inserisci le credenziali richieste per generare la tua password!");
		
		//Inserisco il nome utente
		System.out.println("Inserisci il tuo nome");
		nameUser = inputUser.nextLine();
		
		//Inserisco il cognome utente
		System.out.println("Inserisci il tuo cognome");
		surnameUser = inputUser.nextLine();
		
		//Inserisco il colore utente
		System.out.println("Inserisci il tuo colore preferito");
		colorUser = inputUser.nextLine();
		
		//Inserisco la data di nascita dell'utente
		System.out.println("Inserisci il tuo giorno di nascita");
		dayOfBirthUser = inputUser.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita");
		monthOfBirthUser = inputUser.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita");
		yearOfBirthUser = inputUser.nextInt();
		
		//Formulo la password dell'utente
		String passwordUser = nameUser + "-" + surnameUser + "-" + colorUser + "-" + (dayOfBirthUser + monthOfBirthUser + yearOfBirthUser);
		
		//Visualizzo la password
		System.out.println("The user's password is: " + passwordUser);
		
		inputUser.close();
	}

}
