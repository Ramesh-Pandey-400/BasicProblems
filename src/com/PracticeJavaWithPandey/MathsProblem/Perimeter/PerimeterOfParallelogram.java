package com.PracticeJavaWithPandey.MathsProblem.Perimeter;

import java.util.Scanner;

public class PerimeterOfParallelogram {

    static int getPerimeter(int base, int side)
    {
        return (2 * (base + side));
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();

        int side = scn.nextInt();

        int result  = getPerimeter(base, side);
        System.out.println("The perimeter of the given rectangle of base "
                + base + " and side " + side + " = "
                + result);
    }


}
