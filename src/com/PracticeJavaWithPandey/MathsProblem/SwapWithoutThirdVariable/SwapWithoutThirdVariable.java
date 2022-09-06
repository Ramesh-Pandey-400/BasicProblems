package com.PracticeJavaWithPandey.MathsProblem.SwapWithoutThirdVariable;

public class SwapWithoutThirdVariable {
    public static void main(String [] args)
    {
        int x = 20;
        int y = 30;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
    }
}
