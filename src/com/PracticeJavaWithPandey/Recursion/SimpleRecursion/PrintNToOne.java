package com.PracticeJavaWithPandey.Recursion.SimpleRecursion;

import java.util.Scanner;

public class PrintNToOne {

    static void printNToOne(int n)
    {
        if(n == 0)
            return;

        System.out.println(n+" ");

        printNToOne(n - 1);

    }
    public static void main(String [] args)
    {
        System.out.println("Enter Number from which you want to start:");
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println("Starting Print value from "+n+"....");
        printNToOne(n);

    }
}
