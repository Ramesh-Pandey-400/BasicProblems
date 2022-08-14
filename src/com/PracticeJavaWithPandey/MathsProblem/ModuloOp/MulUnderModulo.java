package com.PracticeJavaWithPandey.MathsProblem.ModuloOp;

import java.util.Scanner;

public class MulUnderModulo {
    long getMulModulo(long a, long b){
        long x = a%1000000007;
        long y =  b%1000000007;
        long result = (x%1000000007 * y%1000000007)%1000000007;
        return result % 1000000007;
    }

    public static void main(String[] args) {
//Considering Modulo Factor as ( (10 power 9) + 7 )
        MulUnderModulo mum = new MulUnderModulo();
                Scanner scn = new Scanner(System.in);
                long val1 = scn.nextLong();
                long val2 = scn.nextLong();
                long result =  mum.getMulModulo(val1,val2);
                System.out.println("For Modulus (1000000007) : Multiplication of " + val1 +" & "+ val2+ " will be : "+ result);







    }

}
