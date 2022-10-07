package com.PracticeJavaWithPandey.MathsProblem.Exponential;

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Power : ");
        double value  = scn.nextDouble();
        double result = Math.exp(value);
        System.out.println("Exponential of "+value+" i.e e raise to power "+value+" is : "+result);
    }

}
