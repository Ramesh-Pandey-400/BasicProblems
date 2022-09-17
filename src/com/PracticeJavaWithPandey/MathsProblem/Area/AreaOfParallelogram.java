package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfParallelogram {
    static int getArea(int base, int height)
    {
        return (base * height);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();

        int height = scn.nextInt();

        int result  = getArea(base, height);
        System.out.println("The Area of the given Parallelogram of base "+base+" and Height "+
                + height  + " = "
                + result);
    }
}
