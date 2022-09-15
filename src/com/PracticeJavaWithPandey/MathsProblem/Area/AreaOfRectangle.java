package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfRectangle {
    static int getArea(int length, int breadth)
    {
        return (length * breadth);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int breadth = scn.nextInt();

        int result  = getArea(length, breadth);
        System.out.println("The Area of the given rectangle of length "
                + length + " and breadth " + breadth + " = "
                + result);
    }
}
