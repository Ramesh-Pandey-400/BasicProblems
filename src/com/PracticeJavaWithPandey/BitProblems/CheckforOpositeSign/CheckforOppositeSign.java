package com.PracticeJavaWithPandey.BitProblems.CheckforOpositeSign;

import java.util.Scanner;

public class CheckforOppositeSign {
        static boolean oppositeSigns(int x, int y)
        {
            return ((x ^ y) < 0);
        }

        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter First Number : ");
            int x = scn.nextInt();
            System.out.print("Enter Second Number : ");
            int y = scn.nextInt();

            if (oppositeSigns(x, y) ){
                System.out.println("Signs are opposite");
            }
            else{
                System.out.println("Signs are not opposite");
            }

        }










}
