package com.PracticeJavaWithPandey.Recursion.Factorial;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static double getFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*getFactorial(n-1);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int value = scn.nextInt();
        double result = getFactorial(value);

        System.out.println("Factorial of "+value+" is : "+result);
    }

}
