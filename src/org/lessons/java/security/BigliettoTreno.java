package org.lessons.java.security;

import java.util.Scanner;

public class BigliettoTreno {
	
	public static void main(String[] args) {
		
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Quanti chilometri devi percorrere?");
		int kmUser = inputUser.nextInt();

		System.out.println("Quanti anni hai?");
		int ageUser = inputUser.nextInt();

		double priceKm = 0.21;
		double travelPrice = kmUser * priceKm;

		if (ageUser < 18){
			travelPrice = travelPrice - ((travelPrice * 20)/100);
			System.out.println("Hai uno sconto del 20%! Il prezzo del biglietto è: " + travelPrice + " €");
		} else if (ageUser > 65) {
			travelPrice = travelPrice - ((travelPrice * 40)/100);
			System.out.println("Hai uno sconto del 40%! Il prezzo del biglietto è: " + travelPrice + " €");
		} else {
			System.out.println("Il prezzo del biglietto è: " + travelPrice + " €");
		};
		
		inputUser.close();
	}
}
