package com.PracticeJavaWithPandey.MathsProblem.Prime;

import java.util.Scanner;

public class BasicPrime {
    boolean ISPRIME = true;
    int n = 2;
    boolean isPrime(int value){
        if(value <= 1){
            ISPRIME = false;
        }
        //check for every value starting from 2 if given value divided completly by n then it cannot be prime
        while(n<value){
            if(value%n==0){
                ISPRIME = false;
                break;
            }
            n++;
        }
        return ISPRIME;
    }

    public static void main(String[] args) {
        BasicPrime bp = new BasicPrime();
        Scanner scn = new Scanner(System.in);
        int value  = scn.nextInt();
        boolean result = bp.isPrime(value);
        if(result){
            System.out.println("PRIME!!!");
        }
        if(!result){
            System.out.println("NON PRIME!!!");
        }
    }
}
