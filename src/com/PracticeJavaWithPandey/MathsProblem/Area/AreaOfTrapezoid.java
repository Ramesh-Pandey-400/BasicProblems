package com.PracticeJavaWithPandey.MathsProblem.Area;

import java.util.Scanner;

public class AreaOfTrapezoid {

    static int getArea(int base1, int base2, int height)
    {
        return (((base1+base2)*height)/2);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base1 = scn.nextInt();
        int base2 = scn.nextInt();
        int height = scn.nextInt();

        int result  = getArea(base1,base2,height);
        System.out.println("The Area of the given Trapezoid of Base 1 : "+base1+" and Base 2 : "+
                + base2  + " and height : "+height+" = "
                + result);
    }

}
