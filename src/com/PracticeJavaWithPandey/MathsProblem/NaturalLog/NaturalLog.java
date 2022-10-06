package com.PracticeJavaWithPandey.MathsProblem.NaturalLog;

import java.util.Scanner;

public class NaturalLog {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value : ");
        double value  = scn.nextDouble();
        double result = Math.log(value);
        System.out.println("Natural Log of "+value+" is :  "+result);

    }
}
