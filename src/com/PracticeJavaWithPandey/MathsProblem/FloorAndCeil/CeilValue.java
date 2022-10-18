package com.PracticeJavaWithPandey.MathsProblem.FloorAndCeil;

import java.util.Scanner;

public class CeilValue {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Value");
        double value  = scn.nextDouble();

        double result = Math.ceil(value);
        System.out.println("Ceil Value of  "+value+" is  "+result);

    }
}
