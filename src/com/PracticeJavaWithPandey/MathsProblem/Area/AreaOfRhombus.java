package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfRhombus {

    static int getArea(int diagonal1, int diagonal2)
    {
        return ((diagonal1*diagonal2)/2);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int diagonal1 = scn.nextInt();

        int diagonal2 = scn.nextInt();

        int result  = getArea(diagonal1, diagonal2);
        System.out.println("The Area of the given Rhombus of Diagonal 1 : "+diagonal1+" and Diagonal 2 : "+
                + diagonal2  + " = "
                + result);
    }
}
