package com.PracticeJavaWithPandey.Recursion.Factorial;

import java.util.Scanner;

public class FactorialUsingTailRecursion {

    public static double getFactorial(int n,int k){
        if(n==0 || n==1){
            return k;
        }
        return getFactorial(n-1,k*n);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int value = scn.nextInt();
        double result = getFactorial(value,1);

        System.out.println("Factorial of "+value+" is : "+result);
    }

}
