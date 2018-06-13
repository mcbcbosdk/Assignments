package com.srh_heidelberg.assignment;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {

    private static int score = 0;
    private static int index = 0;
    private static String answer = "";
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> correctAnswers = new ArrayList<String>();
    private static ArrayList<String> wrongAnswers = new ArrayList<String>();
    private static ArrayList<String> rightAnswers = new ArrayList<String>();

    public static void main(String[] args){
        question1();
        question2();
        question3();
        question4();
        question5();
        System.out.println("Your Score is : "+score);
        System.out.println("Correct Answers are: ");
        for (index =0; index< correctAnswers.size(); index++){
            System.out.println(correctAnswers.get(index));
        }

        if (score == 5){
            System.out.println("Congratulations You have answered all Questions Correctly \n Keep it UP ");
        }else {

            System.out.println("Wrong Answers ------- Right Answers");
            for (index =0; index < wrongAnswers.size(); index++){
                System.out.println(wrongAnswers.get(index)+" -------- "+rightAnswers.get(index));
            }
        }


    }

    private static void question1(){
        System.out.println("Q1. What is the capital of Germany?");
        System.out.println("A.Stuttgart\nB.Heidelberg \nC. Frankfurt \nD. Berlin");
        answer = scanner.nextLine();
        if (answer.toUpperCase().equals("D")){
            correctAnswers.add("Q1: D. Berlin");
            score++;
        }else if (answer.toUpperCase().equals("A")){
            wrongAnswers.add("Q1: A. Stutgart");
            rightAnswers.add("Q1: D. Berlin");
        }else if(answer.toUpperCase().equals("B")){
            wrongAnswers.add("Q1: B. Heidelberg");
            rightAnswers.add("Q1: D. Berlin");
        }else if (answer.toUpperCase().equals("C")){
            wrongAnswers.add("Q1: C. Frankfurt");
            rightAnswers.add("Q1: D. Berlin");
        }


    }

    private static void question2(){

        System.out.println("Q2: Can you store the value “ProgrammingRocks” in the variable of type int");
        System.out.println("A. True\n B. False");
        answer = scanner.nextLine();
        if (answer.toUpperCase().equals("B")){
            correctAnswers.add("Q2: B. False");
            score++;
        }else {
            wrongAnswers.add("Q2: A. True");
            rightAnswers.add("Q2: B. False");
        }

    }

    private static void question3(){

        System.out.println("Q3. What is the result of 9 + 6/3");
        System.out.println(" A. 5 \nB. 11 \nC. 15/3");
        answer= scanner.nextLine();
        if (answer.toUpperCase().equals("B")){
            correctAnswers.add("Q3: B. 11");
            score++;
        }else if (answer.toUpperCase().equals("A")){
            wrongAnswers.add("Q3: A. 5");
            rightAnswers.add("Q3: B. 11");
        }else {
            wrongAnswers.add("Q3: C. 15/3");
            rightAnswers.add("Q3: B. 11");
        }


    }

    private static void question4(){

        System.out.println("Q4: Does Java supports operator Overloading ? ");
        System.out.println("A. Yes \nB. No");
        answer = scanner.nextLine();
        if (answer.toUpperCase().equals("B")){
            correctAnswers.add("Q3: B. No");
            score++;
        }else {
            wrongAnswers.add("Q3: A. Yes");
            rightAnswers.add("Q3: B. No");
        }

    }

    private static void question5(){


        System.out.println("Q5: Java is Platform Independent ");
        System.out.println("A. True \n B. False");
        answer = scanner.nextLine();
        if (answer.toUpperCase().equals("A")){
            correctAnswers.add("Q5: A. True");
            score++;
        }else {
            wrongAnswers.add("Q5: B. False");
            rightAnswers.add("Q5: A. True");
        }

    }

}
