package com.PracticeJavaWithPandey.MathsProblem.Perimeter;

import java.util.Scanner;

public class PerimeterOfTrapezium {
    static int getPerimeter(int a,int b, int c, int d)
    {
        return (a+b+c+d);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();

        int result  = getPerimeter(a,b,c,d);
        System.out.println("The perimeter of the given Trapezium  = "
                + result);
    }

}
