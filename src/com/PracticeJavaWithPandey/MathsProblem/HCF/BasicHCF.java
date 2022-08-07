package com.PracticeJavaWithPandey.MathsProblem.HCF;

import java.util.Scanner;

//BAsic appproach to get HCF or GCD of two number
//Example  : 10 & 20......... 10=1,2,5,"10" & 20= 1,2,4,5,"10",20  hcf is 10
public class BasicHCF {
    //init HCF with 1
    int HCF = 1;
    //Fuction to return GCD or HCF of two Number given in Function Parameter
    public int getHCF(int val1, int val2){
        //get Min. value among two values
        int MIN = Math.min(val1,val2);

        for(int i = MIN; i>0 ; i--){
            if(val1%i==0 & val2%i==0){
                HCF  = i ;
                break;
            }
        }
        return HCF;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
        //call Method getHCF()

        BasicHCF  basicHCF = new BasicHCF();

        int resultHCF = basicHCF.getHCF(val1,val2);
        System.out.println("HCF of two Number "+val1 +" & "+ val2 +" Will be :\t"+resultHCF);
    }
}

