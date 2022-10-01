package com.PracticeJavaWithPandey.BitProblems.CountFlipBits;

import java.util.Scanner;

public class CountFlipBits {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = scn.nextInt();
        System.out.println("Enter Number 2");
        int num2 = scn.nextInt();
        int result = countBitsFlip(num1,num2);
        System.out.println("Number of Bits Need to be flipped to make "+ num2 +" = " +num1+ " are/is : "+result);

    }


    public static int countBitsFlip(int a, int b){

        int count = 0 ;
        while(a!=b){

            if(a%2!=b%2){
                count++;
            }
            b=b/2;
            a=a/2;
        }
        return count;

    }

}
