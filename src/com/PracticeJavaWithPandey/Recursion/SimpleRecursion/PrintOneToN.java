package com.PracticeJavaWithPandey.Recursion.SimpleRecursion;

import java.util.Scanner;

public class PrintOneToN {

    static void printOneToN(int n)
    {
        if(n == 0)
            return;

        printOneToN(n - 1);

        System.out.println(n+" ");

    }
    public static void main(String [] args)
    {
        System.out.println("Enter Number till what you want to reach:");
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println("Starting Print value upto "+n+"....");
        printOneToN(n);

    }

}
