package com.PracticeJavaWithPandey.BitProblems.CheckForPower2;

import java.util.Scanner;
//This Programs gives Time Complexity of Big O of 1       i.e. Constant
public class ContantBasicCheckForPowerOf2 {
    public static boolean isPowerOf2(int number){
        if(number==0){
            return false;
        }
        return ((number & (number-1)) == 0);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean result =  isPowerOf2(number);
        if(result){
            System.out.println("ITS POWER of TWO");
        }
        if(!result){
            System.out.println("ITS NOT POWER of TWO");
        }
    }
}
//((number & (number-1)) == 0); this line is our main Logic will take 4 Example :
/*
    4,6,16,20
    for 4 - 000..0100
    n & n-1 ->  4 & 3 = 0 = True
                000..0100   -   4
                  &
                000..0100   -   3
              =============
                000..0000   -   0
              =============

    n & n-1 ->  6 & 5 = 4 = False
                000..0110   -   6
                  &
                000..0101   -   5
              =============
                000..0100   -   4
              =============
    n & n-1 ->  16 & 15 = 0 = True
                000..10000   -   16
                  &
                000..01111   -   15
              =============
                000..00000   -   0
              =============

    n & n-1 ->  20 & 19 = 4 = False
                000..010100   -   20
                  &
                000..010011   -   19
              =============
                000..010000   -   16
              =============

 */