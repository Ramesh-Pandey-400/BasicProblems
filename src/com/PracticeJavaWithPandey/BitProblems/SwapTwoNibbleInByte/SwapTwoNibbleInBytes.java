package com.PracticeJavaWithPandey.BitProblems.SwapTwoNibbleInByte;

import java.util.Scanner;

public class SwapTwoNibbleInBytes {


    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print(swapNibbles(x));
    }

}
