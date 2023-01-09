package com.PracticeJavaWithPandey.StarPattern;

public class CharacterPattern2 {
    public static void main(String[] args)
    {
        int letter = 65;
        for (int i = 0; i<= 9; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) letter + " ");
            }
            letter++;
            System.out.println();
        }
    }
}
