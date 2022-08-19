package com.PracticeJavaWithPandey.BitProblems.CountSetBit;

import java.util.Scanner;

public class BasicCountSetBit {
    public static int count = 0;
    public static int getCountofSetBit(int number){
        while(number>0){
            if((number & 1) == 1 ){
                count++;
            }
            number = number/2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number for which you want to count Set Bit(1)");
        int number = scn.nextInt();
        System.out.println("Binary form of Integer is as Follows : "+Integer.toBinaryString(number));
        int result  = getCountofSetBit(number);
        System.out.println("Total Number of Set Bit (1) in Number "+number +" is  "+result);
    }
}