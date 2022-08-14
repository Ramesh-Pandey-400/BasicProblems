package com.PracticeJavaWithPandey.MathsProblem.ModuloOp;

import java.util.Scanner;
//Considering Modulo Factor as ( (10 power 9) + 7 )
public class AddUnderModulo {
    long getAddModulo(long a, long b){
        long x = a%1000000007;
        long y =b%1000000007;
        long result = x+y;
        return result%1000000007;
    }
    public static void main(String[] args) {
        AddUnderModulo aum = new AddUnderModulo();
        Scanner scn = new Scanner(System.in);
        long val1 = scn.nextLong();
        long val2 = scn.nextLong();
        long result =  aum.getAddModulo(val1,val2);
        System.out.println("For (1000000007) : Modulus Addition of " + val1 +" & "+ val2+ "will be : "+ result);
    }
}
