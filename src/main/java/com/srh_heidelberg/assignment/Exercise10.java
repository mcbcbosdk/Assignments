package com.srh_heidelberg.assignment;


import java.util.Scanner;

public class Exercise10 {

    private static Scanner scanner;
    private static double sideAXcoordinate;
    private static double sideAYcoordinate;
    private static double sideBXcoordinate;
    private static double sideBYcoordinate;

    public static void main(String[] args){
        boolean isExit = false;
        scanner = new Scanner(System.in);

        while (!isExit){
            getInput();
            double totalDistance = calculateDistance(sideAXcoordinate, sideAYcoordinate, sideBXcoordinate, sideBYcoordinate);
            System.out.println("You entered A("+sideAXcoordinate+","+sideAYcoordinate+") and B("+sideBXcoordinate+","+sideBYcoordinate+")");
            System.out.println("According to Distance Formula the answer is :"+totalDistance);
            if (!isContinue()){
                isExit = true;
            }
        }
    }

    private static void getInput(){
        System.out.println("Enter the ‘x’ coordinate for point A");
        sideAXcoordinate = scanner.nextDouble();
        System.out.println("Enter the ‘y’ coordinate for point A");
        sideAYcoordinate = scanner.nextDouble();
        System.out.println("Enter the ‘y’ coordinate for point B");
        sideBXcoordinate = scanner.nextDouble();
        System.out.println("Enter the ‘x’ coordinate for point B");
        sideBYcoordinate = scanner.nextDouble();
    }

    private static  double calculateDistance(double sideAx, double sideAy, double sideBx, double sideBy){
        double distance = Math.sqrt(Math.pow(subtract(sideBx, sideAx), 2) + Math.pow(subtract(sideBy , sideAy), 2));
        return distance;
    }

    private static  double subtract(double sub1, double sub2){
        return sub1-sub2;
    }

    private static  boolean isContinue(){
        System.out.println("Do you wish to continue (y/n) ? ");
        String answer = scanner.next();
        if (answer.toUpperCase().equals("Y")){
            return true;
        }else{
            return false;
        }

    }


}
