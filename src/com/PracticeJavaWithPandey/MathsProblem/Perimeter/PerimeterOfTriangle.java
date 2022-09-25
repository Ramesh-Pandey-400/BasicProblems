package com.PracticeJavaWithPandey.MathsProblem.Perimeter;

import java.util.Scanner;

public class PerimeterOfTriangle {
    static int getPerimeter(int side1 , int side2, int side3)
    {
        return (side1+side2+side3);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Side 1");
        int side1 = scn.nextInt();
        System.out.println("Enter Side 2");
        int side2 = scn.nextInt();
        System.out.println("Enter Side 3");
        int side3 = scn.nextInt();

        int result  = getPerimeter(side1, side2,side3);
        System.out.println("The Perimeter of the given Triangle of Side1 : "
                + side1 + " ,Side2 : " + side2 + " & Side3 :  "+side3 +" = "
                + result);
    }
}
