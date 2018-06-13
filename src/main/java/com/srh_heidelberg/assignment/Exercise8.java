package com.srh_heidelberg.assignment;

import java.util.Scanner;

public class Exercise8 {

    private static int i;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        part1();
        part2();
        part3();

    }

    private static void part1(){
        System.out.println("Part 1 \n Printing first 10 numbers: ");

        for (i = 1; i <= 10; i++){

            System.out.println(i);

        }
    }

    private static void part2(){

        System.out.println("Part 2 \n Please enter a Number: ");
        int number = scanner.nextInt();


        for (i = 1; i <= number; i++){

            System.out.println(i);

        }

    }

    private static void part3() {

        System.out.println("Part 2 \n Please enter a Number: ");
        int number = scanner.nextInt();

        for (i = 1; i <= number; i++){

            if (i%2 == 0){

                System.out.println(i+"<");

            }else{

                System.out.println(i);

            }

        }

    }
}
