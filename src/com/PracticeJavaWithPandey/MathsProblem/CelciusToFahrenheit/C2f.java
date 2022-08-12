package com.PracticeJavaWithPandey.MathsProblem.CelciusToFahrenheit;

import java.util.Scanner;

public class C2f {
    public double getC2F(int C) {
        //Your code here
        double f = 0;
        f = (C * 9) + 160;
        return f / 5;
    }
    public static void main(String[] args) {
        C2f c2f = new C2f();
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        double result = c2f.getC2F(c);
        System.out.println("Temperature Provided in "+c+" degree Celsius after Conversion will be "+ result+ " Fahrenheit");
    }
}
