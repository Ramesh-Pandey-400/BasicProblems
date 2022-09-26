package com.PracticeJavaWithPandey.MathsProblem.Perimeter;

import java.util.Scanner;

public class PerimeterOfCircle {

    static double getPerimeter(double radius)
    {
        return ((22*2*radius)/7);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = scn.nextDouble();

        double result  = getPerimeter(radius);
        System.out.println("The Perimeter of the given Circle of Radius : "
                + radius +" = "
                + result);
    }
}
