package com.srh_heidelberg.assignment;

import java.util.Scanner;

public class Exercise8Part2 {

    private static Scanner scanner;

    public static void main(String[] args){

        scanner = new Scanner(System.in);
        part1();
        part2();

    }

    private static void part1() {

        int i ;

        System.out.println("Part 1");

        for (i=1; i<= 100; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FOO BAA");
            }else if (i% 5 == 0){
                System.out.println("BAA");
            }else if (i%3 == 0){
                System.out.println("FOO");
            }else {
                System.out.println(i);
            }
        }
    }

    private static void part2() {

        int factorial = 1;

        int number;
        int count = 1;
        System.out.println("Part 2");
        System.out.println("Enter a valid number");
        number = scanner.nextInt();

        while (count <= number ){
            factorial = factorial * count;
            count++;
        }

        System.out.println("Factorial of "+number+" is "+factorial);

    }

}
