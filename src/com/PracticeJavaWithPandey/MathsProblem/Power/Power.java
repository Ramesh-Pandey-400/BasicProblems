package com.PracticeJavaWithPandey.MathsProblem.Power;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base  = scn.nextInt();
        System.out.println("Enter Power : ");
        int power  = scn.nextInt();
        int result = (int)Math.pow(base,power);
        System.out.println(base+" raise to power "+power+" equal to "+result);

    }
}
