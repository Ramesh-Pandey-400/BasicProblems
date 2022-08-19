package com.PracticeJavaWithPandey.BitProblems.CountSetBit;

import java.util.Scanner;

//this algorithm gives time complexity of order of (number of set bits in Number) better as compared to basic approach
public class BrianKernighanCountSetBit {
    public static int count = 0;
    public static int getBCountSetBit(int number){
        while(number>0){
            number  = number & (number-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number for which you want to count Set Bit(1)");
        int number = scn.nextInt();
        System.out.println("Binary form of Integer is as Follows : "+Integer.toBinaryString(number));
        int result  = getBCountSetBit(number);
        System.out.println("Total Number of Set Bit (1) in Number "+number +" is  "+result);

    }
}
