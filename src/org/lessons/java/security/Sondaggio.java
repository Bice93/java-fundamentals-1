package org.lessons.java.security;

public class Sondaggio {
	
	public static void main(String[] args) {
		
		int totalNumberStudents;
		int windowsStudents = 10;
		int linuxStudents = 2;
		int macOsStudents = 8;

		totalNumberStudents = windowsStudents + linuxStudents + macOsStudents;
		System.out.println("Total number of students: " + totalNumberStudents);
		
		float amountWindowsStudents = ((float)windowsStudents/totalNumberStudents) * 100;
		float amountLinuxStudents = ((float)linuxStudents/totalNumberStudents) * 100;
		float amountMacOsStudents = ((float)macOsStudents/totalNumberStudents) * 100;
		
		System.out.println("Windows students: " + (int)amountWindowsStudents + "%" );
		System.out.println("Linux Students: " + (int)amountLinuxStudents + "%" );
		System.out.println("MacOs Students:" + (int)amountMacOsStudents + "%" );
	}
}
