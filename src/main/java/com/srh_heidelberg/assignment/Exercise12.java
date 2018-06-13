package com.srh_heidelberg.assignment;

import java.util.Scanner;

public class Exercise12 {

    private static  int[] sampleArray;
    private static int index;
    private static int size;
    private static Scanner scanner;
    private static int[][] twoDimensionalArray;

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        part1();
        part2();
        part3();
    }

    private static void part1(){
        sampleArray= new int[10];
        for (index = 0; index< sampleArray.length; index++){
            System.out.println("Cell "+index+" contains value: "+index);
        }
    }

    private static void part2(){
        System.out.println("Enter the size of the array = ");
        size = scanner.nextInt();
        sampleArray = new int[size];
        System.out.println("Array of size "+size+" initialized");
        for (index = 0; index < size; index++){
            System.out.print("Enter element "+index+"= ");
            sampleArray[index] = scanner.nextInt();
        }
        displayArrayContents(sampleArray);
    }

    private static void displayArrayContents(int[] array ){
        for (index = 0; index< array.length; index++){
            System.out.println("Cell "+index+" contains value: "+index);
        }
    }


    private static void part3(){

        twoDimensionalArray = new int[2][2];

        for (index = 0; index < 2; index++){
            for (int index2 = 0; index2<2; index2++){
                System.out.print("twoDimensionalArray["+index+"]["+index2+"] = ");
                twoDimensionalArray[index][index2] = scanner.nextInt();
            }
        }
        displayTwoDimensionalArrayContent();

    }

    private static void displayTwoDimensionalArrayContent(){
        System.out.println("The contents of Array are: ");

        for (index = 0; index < 2; index++){
            for (int index2 = 0; index2<2; index2++){
                System.out.println("twoDimensionalArray["+index+"]["+index2+"] = "+twoDimensionalArray[index][index2]);
            }
        }
    }


}
