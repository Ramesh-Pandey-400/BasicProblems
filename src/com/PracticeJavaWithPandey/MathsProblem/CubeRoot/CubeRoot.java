package com.PracticeJavaWithPandey.MathsProblem.CubeRoot;

import java.util.Scanner;

public class CubeRoot {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number : ");
        double number  = scn.nextInt();
        double result = Math.cbrt(number);
        System.out.println("Cube Root of  "+number+" is :  "+result);

    }

}



