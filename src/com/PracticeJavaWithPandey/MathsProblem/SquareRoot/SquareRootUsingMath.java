package com.PracticeJavaWithPandey.MathsProblem.SquareRoot;

import java.util.Scanner;

public class SquareRootUsingMath {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number  = scn.nextInt();
        int result = (int)Math.sqrt(number);
        System.out.println("Square Root of  "+number+" is :  "+result);

    }

}
