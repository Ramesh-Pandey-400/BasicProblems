package com.PracticeJavaWithPandey.MathsProblem.Perimeter;

import java.util.Scanner;

public class PerimeterOfRhombus {
    static int getPerimeter(int side)
    {
        return (4 * side);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();

        int result  = getPerimeter(side);
        System.out.println("The perimeter of the given Rhombus of side "
                + side + " = "
                + result);
    }

}
