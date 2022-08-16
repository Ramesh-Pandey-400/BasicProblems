package com.PracticeJavaWithPandey.MathsProblem.SumOfN;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
                int i, sum = 0;
                for(i = 1; i <= num; ++i)
                {
                    sum = sum + i;
                }
                System.out.println("Sum of First"+ num+ "Natural Numbers is = " + sum);
    }
}
