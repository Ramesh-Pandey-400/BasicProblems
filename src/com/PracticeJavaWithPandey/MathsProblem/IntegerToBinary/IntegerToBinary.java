package com.PracticeJavaWithPandey.MathsProblem.IntegerToBinary;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Integer Value : ");
        int intValue = scn.nextInt();
        String result  = "" ;
        int count = 0;
        while (intValue>=1) {
            if(intValue%2==0){
                result = "0"+result;
            }
            else{
                result = "1"+result;
            }
            intValue =  intValue>>1;
        }
        System.out.println("Result is : "+result);
    }
}
