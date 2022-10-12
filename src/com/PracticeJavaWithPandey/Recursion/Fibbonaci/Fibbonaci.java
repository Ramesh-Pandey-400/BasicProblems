package com.PracticeJavaWithPandey.Recursion.Fibbonaci;

import java.util.Scanner;

public class Fibbonaci {

    public static int fib(int n)
    {
        if(n<=1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of N \n");
        int n = scn.nextInt();
        System.out.println((fib(n)));
    }
}
