package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int gender, alc, weight, hours;
        double bac = 0;
        Scanner sc = new Scanner(System.in);

        //Scan user inputs, making sure they are intigers
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        }
        gender = sc.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("How many ounces of alcohol did you have?");
        }
        alc = sc.nextInt();
        System.out.println("What is your weight, in pounds?");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("What is your weight, in pounds?");
        }
        weight = sc.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("How many hours has it been since your last drink?");
        }
        hours = sc.nextInt();

        //determine gender of user
        if(gender == 1)
            bac = (alc * 5.14 / weight * 0.73) - 0.015 * hours;
        else
            bac = (alc * 5.14 / weight * 0.66) - 0.015 * hours;

        //print out findings
        System.out.println("Your BAC is " + (float)bac);

        if(bac < 0.08)
            System.out.println("It is legal for you to drive");
        else
            System.out.println("It is not legal for you to drive");

        sc.close();
    }
}