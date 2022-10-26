package com.PracticeJavaWithPandey.MathsProblem.Exponential;

import java.util.Scanner;

public class Expm1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Power : ");
        double value  = scn.nextDouble();
        double result = Math.expm1(value);
        System.out.println("Power of E for "+value+" after subtracting 1 from it is : "+result);
    }
}
