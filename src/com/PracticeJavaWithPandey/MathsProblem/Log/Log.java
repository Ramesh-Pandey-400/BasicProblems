package com.PracticeJavaWithPandey.MathsProblem.Log;

import java.util.Scanner;

public class Log {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value ");
        double value  = scn.nextDouble();
        double result = Math.log(value);
        System.out.println("Natural Log of "+value+" is : "+result);
    }
}
