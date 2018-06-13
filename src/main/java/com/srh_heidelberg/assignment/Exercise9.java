package com.srh_heidelberg.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {

    private static float sideA;
    private static float sideB;
    private static float sideC;
    private static float perimeter;
    private static float area;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the length of sides of triangle");
        System.out.print("Side A -");
        sideA = scanner.nextFloat();
        System.out.print("Side B -");
        sideB =  scanner.nextFloat();
        System.out.print("Side C -");
        sideC =  scanner.nextFloat();
        perimeter = getPerimeter(sideA,sideB,sideC);
        area = (float) Math.sqrt(perimeter*(perimeter - sideA)*(perimeter - sideB)*(perimeter - sideC));
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        System.out.println("Area of triangle with sides "+decimalFormat.format(sideA)+","+decimalFormat.format(sideB)+","+decimalFormat.format(sideC)+"= "+area);
    }

    private static  float getPerimeter(float side1, float side2, float side3){
        return (side1+side2+side3)/2;
    }
}
