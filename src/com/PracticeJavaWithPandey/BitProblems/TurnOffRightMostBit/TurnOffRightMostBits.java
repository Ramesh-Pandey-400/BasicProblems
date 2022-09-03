package com.PracticeJavaWithPandey.BitProblems.TurnOffRightMostBit;

import java.util.Scanner;

public class TurnOffRightMostBits {
    static int resetRightMostBit(int n)
    {
        return n & (n - 1);
    }

    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Original Number : ");
        int originalNumber = scn.nextInt();
        System.out.println("The number after Turning Off the rightmost set bit is : " + resetRightMostBit(originalNumber));
    }
}
