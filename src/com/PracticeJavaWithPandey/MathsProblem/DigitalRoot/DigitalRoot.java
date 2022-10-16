package com.PracticeJavaWithPandey.MathsProblem.DigitalRoot;

import java.util.Scanner;

public class DigitalRoot {

    public static int digitalRoot(int n)
    {
        // add your code here
        int result = 0;
        if(n<10){
            result  = n;
        }
        else{
            while(n>0){
                result = result + n%10;
                n = n/10;
            }
            return digitalRoot(result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num  = scn.nextInt();
        System.out.println("Digital Root of Given Number "+num +" is : "+Math.signum(num));
    }

}
