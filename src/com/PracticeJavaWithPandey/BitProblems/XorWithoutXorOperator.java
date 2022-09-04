package com.PracticeJavaWithPandey.BitProblems;

public class XorWithoutXorOperator {
    static int getXOR(int x, int y)
    {
        return (x | y) &
                (~x | ~y);
    }

    // Driver Code
    public static void main (String[] args)
    {
        int x = 3, y = 5;
        System.out.println("XOR is "+
                (getXOR(x, y)));
    }
}
