package com.PracticeJavaWithPandey.MathsProblem.Log10;

import java.util.Scanner;

public class Log10 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value ");
        double value  = scn.nextDouble();
        double result = Math.log10(value);
        System.out.println("Log10 of "+value+" is : "+result);

    }
}
