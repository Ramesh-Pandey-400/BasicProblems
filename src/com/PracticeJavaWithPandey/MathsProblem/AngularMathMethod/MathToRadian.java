package com.PracticeJavaWithPandey.MathsProblem.AngularMathMethod;

import java.util.Scanner;

public class MathToRadian {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Degree");
        double value  = 180;

        double result = Math.toRadians(value);
        System.out.println(" Radian  value of  given Degree "+value+" is  "+result);

    }
}
