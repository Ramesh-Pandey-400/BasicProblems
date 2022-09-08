package com.PracticeJavaWithPandey.BitProblems.CheckTwoNumberSame;

import java.util.Scanner;

public class CheckTwoNumberSame {


    static void areTheySame(int a, int b)
    {
        if ((a ^ b) != 0)
            System.out.print("Numbers are Not Same");
        else
            System.out.print("Numbers are Same");
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        areTheySame(x,y);
    }

}
