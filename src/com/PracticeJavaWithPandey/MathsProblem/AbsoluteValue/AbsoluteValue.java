package com.PracticeJavaWithPandey.MathsProblem.AbsoluteValue;

import java.util.Scanner;

public class AbsoluteValue {
    public int getAbsolute(int I) {
        // code here
        if(I>0){
            return I;
        }
        else{
            return (Math.abs(I));
        }
    }
    public static void main(String[] args) {
        AbsoluteValue av = new AbsoluteValue();
        Scanner scn   = new Scanner(System.in);
        int value = scn.nextInt();
        int result  = av.getAbsolute(value);
        System.out.println("Absolute Value of "+value+" is : "+result);
    }
}
