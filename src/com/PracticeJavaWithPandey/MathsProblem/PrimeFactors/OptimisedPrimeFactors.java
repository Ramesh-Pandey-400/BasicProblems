package com.PracticeJavaWithPandey.MathsProblem.PrimeFactors;

import java.util.Scanner;

public class OptimisedPrimeFactors {
    int X=1;
    void getPrimeFactorsOpt(int value) {
        if(value%2==0){
            System.out.println(2);
            value = value / 2;
            getPrimeFactorsOpt(value);
        }
        else if(value%3==0){
            System.out.println(3);
            value = value / 3;
            getPrimeFactorsOpt(value);
        }
        else{
            for (int i=5 ; i*i < value; i=i+6) {
                if (value % i == 0) {
                    System.out.println(i);
                    value= value / i;
                    getPrimeFactorsOpt(value);
                    break;
                }
        }
            System.out.println(value);

        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int value =  scn.nextInt();
        OptimisedPrimeFactors obpf = new OptimisedPrimeFactors();
        System.out.println("Prime Factors of "+value +  " are : ");
        obpf.getPrimeFactorsOpt(value);
    }
}
