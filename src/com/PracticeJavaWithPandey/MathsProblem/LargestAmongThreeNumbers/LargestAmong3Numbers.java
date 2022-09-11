package com.PracticeJavaWithPandey.MathsProblem.LargestAmongThreeNumbers;

import java.util.Scanner;

public class LargestAmong3Numbers {
    static int getLargestOfThree(int x, int y, int z)
    {

        return Math.max(z, (Math.max(x, y)));
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scn.nextInt();
        System.out.println("Enter Second Number");
        int b = scn.nextInt();
        System.out.println("Enter Third Number");
        int c = scn.nextInt();
        int largest = getLargestOfThree(a, b, c);
        System.out.println(largest
                + " is the largest number.");
    }
}