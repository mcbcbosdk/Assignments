package com.srh_heidelberg.assignment;

import java.util.Scanner;

public class Exercise5Part2 {

	private static int age;
	private static String name;

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		name = scanner.next();
		System.out.println("Enter your Age: ");
		age = scanner.nextInt();
		
		if(age < 16) {
			
			System.out.println("Sorry you do not have a driving license "+name);
			
		}
		
		if(age < 18) {
			
			System.out.println("Sorry you cannot vote "+name);
			
		}
		
		if(age > 18) {
			
			System.out.println("You can do what is legal "+name);
			
		}
		
		if(age > 60) {
			
			System.out.println("Welcome to the senior citizens club "+name);
		
		}
		
		if(age >=18 && age <= 30 ) {
			
			System.out.println("Don’t do anything stupid, these are the most important years of your\r\n" + 
					"life "+name);
			
		}
		
		scanner.close();
	}

	
}
