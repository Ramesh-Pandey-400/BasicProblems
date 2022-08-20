package com.PracticeJavaWithPandey.BitProblems.CheckForPower2;

import java.util.Scanner;
//This Program will give Time Complexity of Big O of Number set bit

public class BasicCheckForPower2 {
    public static boolean isPowerOf2(int number){
        if(number==0){
            return false;
        }
        while(number!=1){
            if(number%2!=0){
                return false;
            }
            number =  number/2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number  =  scn.nextInt();
        boolean result = isPowerOf2(number);

        if(result){
            System.out.println("ITS POWER OF 2 !!");
        }
        else{
            System.out.println("ITS NOT POWER OF 2!!");
        }
    }
}
