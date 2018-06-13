package com.srh_heidelberg.assignment;

import java.util.Scanner;

public class Exercise3 {
	
	private static int number1;
	private static int number2;
	
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer1 : ");
		number1 = scanner.nextInt();
		System.out.println("Enter Integer2 : ");
		number2 = scanner.nextInt();
		
		System.out.println("+ Plus Operator: "+addition(number1, number2));
		System.out.println("- Minus Operator: "+subtraction(number1, number2));
		System.out.println("/ Slash Operator: "+divide(number1, number2));
		System.out.println("* Asterik Operator: "+multiply(number1, number2));
		System.out.println("% Percent Operator: "+modulo(number1, number2));
		System.out.println("Example for < Less than And > greater Than");
		greaterNumber(number1, number2);
		System.out.println("Example for <= less-than-or-equal And >= greater-than-or-equal");
		greaterThanEqual(number1, number2);
		scanner.close();
	}
	
	private static int addition(int num1, int num2) {
		return num1+num2;
	}
	
	private static int subtraction(int num1, int num2) {
		return num1-num2;
	}
	
	private static int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	private static double divide(double num1, int num2) {
		return num1/num2;
	}

	private static int modulo(int num1, int num2) {
		return num1 % num2;
	}
	
	private static void greaterNumber(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1+" is Greater than "+num2);
		}else if(num1 < num2){
			System.out.println(num1+" is Lesser than "+num2);
		} else { 
			System.out.println(num1+" is Equal to "+num2);
		}
	}
	
	private static void greaterThanEqual(int num1, int num2) {
		
		if(num1 >= num2) {
			System.out.println(num1+" >= "+num2);
		}else {
			System.out.println(num1+" <= "+num2);
		}
	}
}
