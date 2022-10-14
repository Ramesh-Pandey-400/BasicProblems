package com.PracticeJavaWithPandey.Recursion.CountDigit;

import java.util.Scanner;

public class CountDigit {

    public static int sumOfDigits(int n)
    {
        int result = 0 ;
        while(n!=0){
            result++;
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number ");
        Scanner scn = new Scanner(System.in);
        int number  =  scn.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Total Number of Digits present in number "+number+" is : "+result);
    }

}

