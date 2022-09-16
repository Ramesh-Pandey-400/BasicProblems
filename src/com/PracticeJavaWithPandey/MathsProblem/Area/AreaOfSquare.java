package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfSquare {

    static int getArea(int side)
    {
        return (side*side);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();
        int result  = getArea(side);
        System.out.println("The Area of the given Square of side "
                + side  + " = "
                + result);
    }

}
