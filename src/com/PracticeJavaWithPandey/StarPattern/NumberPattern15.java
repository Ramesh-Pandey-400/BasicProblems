package com.PracticeJavaWithPandey.StarPattern;

public class NumberPattern15 {
    public static void main(String[] args)
    {
        int i, j, rows=5;
        for (i = 1; i <= rows; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for (j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
