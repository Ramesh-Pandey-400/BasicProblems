package com.PracticeJavaWithPandey.MathsProblem.FloorAndCeil;

import java.util.Scanner;

public class FloorValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Value");
        double value  = scn.nextDouble();

        double result = Math.floor(value);
        System.out.println("Floor Value of  "+value+" is  "+result);

    }
}
