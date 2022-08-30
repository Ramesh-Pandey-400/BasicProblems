package com.PracticeJavaWithPandey.MathsProblem.EquationCheck1;

import java.util.Scanner;

public class EquationCheck1 {
    static void solution(int a, int b, int n)
    {
        // traverse for all possible values
        for (int i = 0; i * a <= n; i++)
        {

            // check if it is satisfying the equation
            if ((n - (i * a)) % b == 0)
            {
                System.out.println("x = " + i +
                        ", y = " +
                        (n - (i * a)) / b);

                return ;
            }
        }

        System.out.println("No solution");
    }


    public static void main (String[] args)
    {
        //euation is ...............  ax+by = n
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = scn.nextInt();
        System.out.println("Enter b : ");
        int b = scn.nextInt();
        System.out.println("Enter n : ");
        int n = scn.nextInt();
        solution(a, b, n);

    }
}
