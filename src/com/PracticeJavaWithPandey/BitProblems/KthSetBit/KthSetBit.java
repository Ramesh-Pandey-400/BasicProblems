package com.PracticeJavaWithPandey.BitProblems.KthSetBit;

import java.util.Scanner;

public class KthSetBit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scn.nextInt();
        System.out.println("Binary Representation of number will be :"+Integer.toBinaryString(n));
        System.out.println("Enter Term you want to check");
        int k = scn.nextInt();
        if(((n>>(k-1))&1) == 1  ){
            System.out.println("The "+k+"th Bit in Number "+n+" is "+ "SET i.e. -  1");
        }
        else{
            System.out.println("The "+k+"th Bit in Number "+n+" is "+ "RESET i.e. -  0");
        }
    }
}
