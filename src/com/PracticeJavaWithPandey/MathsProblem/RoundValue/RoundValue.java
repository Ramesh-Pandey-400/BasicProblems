package com.PracticeJavaWithPandey.MathsProblem.RoundValue;

import java.util.Scanner;

public class RoundValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Value");
        double value  = scn.nextDouble();

        double result = Math.round(value);
        System.out.println("Round Value of  "+value+" is  "+result);

    }
}
