package com.PracticeJavaWithPandey.MathsProblem.PrimeFactors;
//any Number whether Composite or PRIME  has factors factors which can be formed by multiplying PRime Factor of that number

import com.PracticeJavaWithPandey.MathsProblem.Prime.BasicPrime;

import java.util.Scanner;

// Example :
// 8 = 2*2*2 :  10=2*5 : 115 : 5*23 :
//for PRIME it has prime factor only its number itself:
//example:  17 = 1*17 but 1 is not a prime Number so Prime Factorisation for Prime is Its Number Itself.
public class BasicPrimeFactors {
    //1115 - 223
    int X=1;
    void getPrimeFactors(int value) {
        for (int i=2 ; i < value; i++) {
            if (value % i == 0) {
                System.out.println("VV"+i);
                value= value / i;
                getPrimeFactors(value);
                break;
            }
            else if(value==i+1){
                System.out.println("XX"+value);
                break;
            }
        }
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int value =  scn.nextInt();
        BasicPrimeFactors bpf = new BasicPrimeFactors();
        System.out.println("Prime Factors of "+value +  " are : ");
        bpf.getPrimeFactors(value);
    }

}
