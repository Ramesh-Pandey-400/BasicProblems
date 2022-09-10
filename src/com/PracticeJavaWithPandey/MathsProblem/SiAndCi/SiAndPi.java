package com.PracticeJavaWithPandey.MathsProblem.SiAndCi;

import java.util.Scanner;

public class SiAndPi {
    public static double getSimpleInterest(double principle,double rate, double time){
        double simpleInterest = (principle*rate*time)/100;
        return simpleInterest;
    }
    public static double getCompoundInterest(double principle,double rate, double time){
        double compoundInterest = principle * (Math.pow((1 + rate / 100), time));
        return compoundInterest;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Choice : \nPress 1 for Calculating Simple Interest.\nPress 2 for Calculating compound Interest.\nPress any other key to exit.");
        Scanner scn =new Scanner(System.in);
        String choice = scn.next();
        if(choice.equals("1")){
            System.out.println("Enter Principle : ");
            double principle = scn.nextDouble();
            System.out.println("Enter Rate: ");
            double rate = scn.nextDouble();
            System.out.println("Enter Time : ");
            double time = scn.nextDouble();
            double result  = getSimpleInterest(principle,rate,time);
            System.out.println("Simple Interest Will be : "+result);
        }
        if(choice.equals("2")){
            System.out.println("Enter Principle : ");
            double principle = scn.nextDouble();
            System.out.println("Enter Rate: ");
            double rate = scn.nextDouble();
            System.out.println("Enter Time : ");
            double time = scn.nextDouble();
            double result  = getCompoundInterest(principle,rate,time);
            System.out.println("Compound Interest Will be : "+result);
        }
        else{
            System.out.println("Exiting......");
        }
    }
}