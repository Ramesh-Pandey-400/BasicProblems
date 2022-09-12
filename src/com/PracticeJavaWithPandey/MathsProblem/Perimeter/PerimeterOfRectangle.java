package com.PracticeJavaWithPandey.MathsProblem.Perimeter;

import java.util.Scanner;

public class PerimeterOfRectangle {
    static int getPerimeter(int length, int breadth)
    {
        return (2 * (length + breadth));
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int breadth = scn.nextInt();

        int result  = getPerimeter(length, breadth);
        System.out.println("The perimeter of the given rectangle of length "
                + length + " and breadth " + breadth + " = "
                + result);
    }
}
