package com.PracticeJavaWithPandey.MathsProblem.Prime;

import java.util.Scanner;

public class OptimisedPrime {
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    boolean ISPRIME = true;
    //it reduce time complexity from O(n) to O(root n)
    boolean isOprime (int value){
        if(value==1){
            ISPRIME=true;
        }
        if( value==2 || value==3){
            ISPRIME = true;
        }
        if( value%2==0 || value%3==0){
            ISPRIME = false;
        }
        for(int i = 5 ; i*i<value ; i = i+6){
            if( value%i==0 || value%(i+2)==0){
                ISPRIME = false;
                break;
            }
        }
        return ISPRIME;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        OptimisedPrime  op = new OptimisedPrime();
        boolean  result = op.isOprime(value);
        if(result){
            System.out.println("PRIME!!");
        }
        if (!result){
            System.out.println("NON PRIME!!");
        }
    }
}
