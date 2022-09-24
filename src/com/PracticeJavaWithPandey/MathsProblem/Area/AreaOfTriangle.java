package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfTriangle {
    static int getArea(int base , int height)
    {
        return ((base * height)/2);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();

        int height = scn.nextInt();

        int result  = getArea(base, height);
        System.out.println("The Area of the given Triangle of base "
                + base + " and height " + height + " = "
                + result);
    }
}
