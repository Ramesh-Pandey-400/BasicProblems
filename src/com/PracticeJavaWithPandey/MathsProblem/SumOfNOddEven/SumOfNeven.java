package com.PracticeJavaWithPandey.MathsProblem.SumOfNOddEven;

import java.util.Scanner;

public class SumOfNeven {
    public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                System.out.println("Even Number present in first "+n+ "natural number are:\n");
                for(int i = 1 ; i<=n ; i++ ){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }








    }
}
