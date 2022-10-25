package com.PracticeJavaWithPandey.MathsProblem.Log1p;

import java.util.Scanner;

public class Log1p {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value ");
        double value  = scn.nextDouble();
        double result = Math.log1p(value);
        System.out.println("Natural Log of "+value+" is : "+result);

    }
}
