package com.srh_heidelberg.assignment;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {


    private static int count = 3;
    private static int pin = 9876;
    private static int enteredPin;
    private static Scanner scanner;


    public static void main(String[] args){

        scanner = new Scanner(System.in);
        part1();
        part2();
        part3();
        part4();

    }

    private static  void part1(){

        System.out.println("Part 1 \n Welcome to Bank of SRH");
        while (count > 0){
            System.out.println("Enter your PIN");
            enteredPin = scanner.nextInt();
            if (enteredPin == pin){
                System.out.println("Successfully Logged In");
                break;
            }else if (count == 1){
                System.out.println("ATM card blocked");
                break;
            }else {
                System.out.println("Wrong pin please try again");
                count--;
            }
        }
    }

    private static void  part2(){
        int number = 1;
        int numberEntered;
        int sum = 0;

        System.out.println("Part2 \n Type the message to print on the screen");
        String message = scanner.nextLine();

        while(number < 6){
            System.out.println("Insert number "+number);
            numberEntered = scanner.nextInt();
            sum = sum + numberEntered;
            number++;
        }

        System.out.println("Final result is "+sum+" "+message);
    }

    private static void  part3(){

        Random random = new Random();
        int randomNumber = random.nextInt(9)+1;
        int chance = 1 ;
        int userValue;

        System.out.println("Random number generated … You get 3 chances to guess the number");

        while (chance <= 3 ){
            System.out.println("Chance "+chance);
            userValue = scanner.nextInt();
            if (userValue == randomNumber){
                System.out.println("You are lucky, you guessed the correct number");
                break;
            }else if (chance == 3){
                System.out.println("Sorry your chances are over ");
                break;
            }else {
                System.out.println("Better luck next time");
                chance++;
            }
        }

    }

    private static void part4(){

        boolean flip = true;
        while (flip){
            if (flipcoin()){
                System.out.println("You flipped the coin and the result was – HEADS");
            }else {
                System.out.println("You flipped the coin and the result was – Tails");
            }
            System.out.println("Do you want to flip again (y/n)?");
            String answer = scanner.next();
            if (answer.toUpperCase().equals("N")){
                flip = false;
            }
        }

    }

    private static boolean flipcoin(){
        Random randomValue = new Random();
        int value = randomValue.nextInt(2);
        System.out.println(value);
        if (value == 0){
            return true;
        }else {
            return false;
        }
    }

}
