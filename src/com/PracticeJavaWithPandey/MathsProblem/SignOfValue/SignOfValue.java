package com.PracticeJavaWithPandey.MathsProblem.SignOfValue;

import java.util.Scanner;

public class SignOfValue {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num  = scn.nextInt();
        System.out.println("Sign of Given Number "+num +" is : "+Math.signum(num));
    }

}
