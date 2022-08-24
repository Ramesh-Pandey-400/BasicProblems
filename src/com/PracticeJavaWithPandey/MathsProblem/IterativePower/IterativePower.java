package com.PracticeJavaWithPandey.MathsProblem.IterativePower;

import java.util.Scanner;

public class IterativePower {
    static int power(int x, int y)
    {
        // Initialize result
        int res = 1;

        while (y > 0)
        {
            // If y is odd,
            // multiply
            // x with result
            if ((y & 1) == 1)
                res = res * x;

            // y must be even now
            y = y >> 1; // y = y/2
            x = x * x; // Change x to x^2
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Base");
        int x = scn.nextInt();
        System.out.println("Enter Power");
        int y = scn.nextInt();

                System.out.println(x+"power"+y+"is :" + power(x, y));







    }
}
