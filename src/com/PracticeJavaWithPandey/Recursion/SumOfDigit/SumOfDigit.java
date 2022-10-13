package com.PracticeJavaWithPandey.Recursion.SumOfDigit;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumOfDigits(int n)
    {
        int result = 0 ;
        while(n!=0){
            result = result + n%10;
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number ");
        Scanner scn = new Scanner(System.in);
        int number  =  scn.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Sum of All Digits present in number "+number+" is : "+result);
    }
}
