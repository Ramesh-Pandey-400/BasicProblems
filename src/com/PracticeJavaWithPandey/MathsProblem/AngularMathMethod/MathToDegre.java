package com.PracticeJavaWithPandey.MathsProblem.AngularMathMethod;

import java.util.Scanner;

public class MathToDegre {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Radian");
        double value  = Math.PI;

        double result = Math.toDegrees(value);
        System.out.println(" Angle  value of  given radian "+value+" is  "+result);

    }
    }

