package com.PracticeJavaWithPandey.BitProblems.CountSetBit;

import java.util.Scanner;

public class CountFirstSetBitPosition {
    public static int getFirstSetBit(int n){

        // Your code here
        int count = 0;
        int result = 0;
        while(n!=1){
            count++;
            if(n%2!=0){
                result = 1;
                break;
            }
            n = n/2;
        }

        if(result ==0){
            count = 0;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println("Enter any Number : ");
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();

        System.out.println("Position of first Set Bit for Given Number is : "+ getFirstSetBit(n));
    }



}
