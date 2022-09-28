package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfEllipse {

    static double getArea(double r1,double r2)
    {
        return ((22*r1*r2)/7);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Radius");
        double r1 = scn.nextDouble();
        double r2 = scn.nextDouble();

        double result  = getArea(r1,r2);
        System.out.println("The Perimeter of the given Circle of Radius1 : "
                + r1 +"Radius2 : "+r2+" = "
                + result);
    }

}
