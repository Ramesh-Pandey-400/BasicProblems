package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfCircle {
    static double getArea(double radius)
    {
        return ((22*radius*radius)/7);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = scn.nextDouble();

        double result  = getArea(radius);
        System.out.println("The Perimeter of the given Circle of Radius : "
                + radius +" = "
                + result);
    }
}
