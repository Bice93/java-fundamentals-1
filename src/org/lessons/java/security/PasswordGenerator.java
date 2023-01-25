package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String nameUser = "Giovanna";
		String surnameUser = "Rossi";
		String colorUser = "Azzurro";
		int dayOfBirthUser = 10;
		int monthOfBirthUser = 5;
		int yearOfBirthUser = 1999;
		
		String passwordUser = nameUser + "-" + surnameUser + "-" + colorUser + "-" + (dayOfBirthUser + monthOfBirthUser + yearOfBirthUser);
		
		System.out.println("The user's password is: " + passwordUser);
	}

}
