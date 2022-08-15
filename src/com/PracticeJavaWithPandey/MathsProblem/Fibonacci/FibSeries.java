package com.PracticeJavaWithPandey.MathsProblem.Fibonacci;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {

        int i;

        // initialize first and second terms
        int t1 = 0, t2 = 1;

        // initialize the next term (3rd term)
        int nextTerm = t1 + t2;

        // get no. of terms from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= scn.nextInt();

        // print the first two terms t1 and t2
        System.out.println("Fibonacci Series: \n"+ t1 +"\n"+ t2);

        // print 3rd to nth terms
        for (i = 3; i <= n; ++i) {
            System.out.println(nextTerm);
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
        }
    }
}
