package com.srh_heidelberg.assignment;

import java.util.Scanner;

public class Exercise5Part1 {

	private static int people;
	private static int cats;
	private static int dogs;
	 
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of People: ");
		people = scanner.nextInt();
		System.out.println("Enter the number of Cats: ");
		cats = scanner.nextInt();
		System.out.println("Enter the number of Dogs");
		dogs = scanner.nextInt();
		
		if(people < cats) {
			
			System.out.println("Cats take over the world");
			
		}else if(people > cats) {
			
			System.out.println("People are going to pollute the world");
			
		}
		
		if(dogs < people) {
			
			System.out.println("The world is a boring place");
			
		}else if(dogs > people) {
			
			System.out.println("The world is getting drooled");
			
		}
		
		if(dogs < cats) {
			
			System.out.println("The world is deprived of happiness");
			
		}else if(cats < dogs) {
			
			System.out.println("Dogs saved the world from misery");
			
		}
	
		scanner.close();
		
	}
	
}
