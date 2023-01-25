package org.lessons.java.security;

import java.util.Scanner;

public class Sondaggio {
	
	public static void main(String[] args) {
		
		int totalNumberStudents;
		int windowsStudents;
		int linuxStudents;
		int macOsStudents;
		
		Scanner inputStudent = new Scanner(System.in);
		
		//Inserisco gli studenti che usano windows
		System.out.println("Quanti studenti usano Windows?");
		windowsStudents = inputStudent.nextInt();
		
		//Inserisco gli studenti che usano linux
		System.out.println("Quanti studenti usano Linux?");
		linuxStudents = inputStudent.nextInt();
		
		//Inserisco gli studenti che usano macOs
		System.out.println("Quanti studenti usano MacOs?");
		macOsStudents = inputStudent.nextInt();
		
		totalNumberStudents = windowsStudents + linuxStudents + macOsStudents;
		System.out.println("Total number of students: " + totalNumberStudents);
		
		double amountWindowsStudents = ((double)windowsStudents/totalNumberStudents) * 100;
		double amountLinuxStudents = ((double)linuxStudents/totalNumberStudents) * 100;
		double amountMacOsStudents = ((double)macOsStudents/totalNumberStudents) * 100;
		
		System.out.println( Math.round(amountWindowsStudents * 100.0)/100.0 + "%" + " of students use Windows" );
		System.out.println( Math.round(amountLinuxStudents * 100.0)/100.0 + "%" + " of students use Linux" );
		System.out.println( Math.round(amountMacOsStudents * 100.0)/100.0 + "%" + " of students use MacOs" );
		
		inputStudent.close();
	}
}
