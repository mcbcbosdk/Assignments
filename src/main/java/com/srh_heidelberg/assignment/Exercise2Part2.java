package com.srh_heidelberg.assignment;

import java.util.Scanner;

/**
 * Exercise2Part2
 *
 */

public class Exercise2Part2 {
	
	private static String firstName = "First name: ";
	private static String lastName = "Last name: ";
	private static String gender = "Gender (M/F): ";
	private static String maritalStatus = "Marital status (true or false): ";
	private static String height = "Height (cm or feet): ";
	private static String eyeColor = "Colour of Eyes: ";
	private static String hairColor = "Colour of Hair: ";
	private static String primarySchool = "Name of primary school: ";
	private static String secondarySchool = "Name of secondary school:";
	private static String university = "Name of University : ";
	private static String address = "Local Address: ";
	private static String phoneNumber = "Phone Number: ";
	
	
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("a. "+firstName);
		student.setFirstName(scanner.next());
		

		System.out.println("b. "+lastName);
		student.setLastName(scanner.next());
		
		System.out.println("c. "+gender);
		student.setGender(scanner.next());
		
		System.out.println("d. "+maritalStatus);
		student.setMaritalStatus(scanner.nextBoolean());
		
		System.out.println("e." +height);
		student.setHeight(scanner.nextDouble());
		
		System.out.println("f." +eyeColor);
		student.setEyeColor(scanner.next());
		
		System.out.println("g. "+hairColor);
		student.setHairColor(scanner.next());
		
		System.out.println("h. "+primarySchool);
		student.setPrimarySchool(scanner.next());
		
		System.out.println("i. "+secondarySchool);
		student.setSecondarySchool(scanner.next());
		
		System.out.println("j. "+university);
		student.setUniversity(scanner.next());
		
		System.out.println("k. "+address);
		student.setLocalAddress(scanner.next());
		
		System.out.println("l. "+phoneNumber);
		student.setPhoneNumber(scanner.nextLong());
		
		System.out.println("a. "+firstName+student.getFirstName());
		System.out.println("b. "+lastName+student.getLastName());
		System.out.println("c. "+gender+student.getGender());
		System.out.println("d. "+maritalStatus+student.isMaritalStatus());
		System.out.println("e. "+height+student.getHeight());
		System.out.println("f. "+eyeColor+student.getEyeColor());
		System.out.println("g. "+hairColor+student.getHairColor());
		System.out.println("h. "+primarySchool+student.getPrimarySchool());
		System.out.println("i. "+secondarySchool+student.getSecondarySchool());
		System.out.println("j. "+university+student.getUniversity());
		System.out.println("k. "+address+student.getLocalAddress());
		System.out.println("l. "+phoneNumber+student.getPhoneNumber());
		scanner.close();
	}

}
