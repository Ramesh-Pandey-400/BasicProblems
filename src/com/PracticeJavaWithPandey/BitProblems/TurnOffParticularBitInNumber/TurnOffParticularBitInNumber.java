package com.PracticeJavaWithPandey.BitProblems.TurnOffParticularBitInNumber;

import java.util.Scanner;

public class TurnOffParticularBitInNumber {


    static int getNumberAfterTurnOffK(int n, int k)
    {
        // k must be greater than 0
        if (k <= 0){
            return n;
        }

        return (n & ~(1 << (k - 1)));
    }

    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Original Number : ");
        int number = scn.nextInt();
        System.out.println("Enter Position of Bit you want to turn off : ");
        int kthBitToBeTurnOff = scn.nextInt();
        System.out.println("Bit After turn off : ");
        System.out.print(getNumberAfterTurnOffK(number,kthBitToBeTurnOff));
    }

}
