package org.lessons.java.security;

public class CibiPreferiti {
	
	public static void main(String[] args) {
			
		String[] foods = {"Fiorentina", "Lasagna", "Pizza", "Ramen", "Bibimbap", "Genovese", "Hamburger", "Calamarata"};
		
		//Stampo la lunghezza dell'array
		System.out.println("La lunghezza dell'array è: " + foods.length );
		
		//Stampo il primo piatto
		System.out.println("Il mio cibo preferito è: " + foods[0] );
		
		//Stampo l'ultimo piatto
		System.out.println("Il mio cibo preferito ma non troppo: " + foods[foods.length - 1] );
	}

}
