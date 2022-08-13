package com.PracticeJavaWithPandey.MathsProblem.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact= 1;
        int i = 2;
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        while(i<=N){
            fact  =  fact*i;
            i++;
        }
        System.out.println("Factorial of "+N+" will be : "+fact);
    }
}
