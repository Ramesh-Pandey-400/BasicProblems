package com.PracticeJavaWithPandey.StarPattern;

public class NumberPattern16 {

    public static void main(String[] args)
    {
        int i, j, rows=5;
        for (i = rows; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (i = 2; i <= rows; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
