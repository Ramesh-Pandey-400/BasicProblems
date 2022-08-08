package com.PracticeJavaWithPandey.MathsProblem.LCM;

import java.util.Scanner;

public class BasicLCM {
    int LCM = 1 ;
    boolean isNotLCM =  true;
    //BAsic appproach to get HCF or GCD of two number
//Example  : 10 & 20......... 10=10,20,30,40,50, & 20= 20,40,60,80 lcm is 20

    int getBasicLCM(int val1, int val2){
        int MAX = Math.max(val1,val2);
        while(isNotLCM){
            if(MAX%val1==0 && MAX%val2==0){
                LCM = MAX;
                isNotLCM = false;
                break;
            }
            MAX++;
        }
        return LCM;
    }
    public static void main(String[] args) {
        BasicLCM blcm = new BasicLCM();
        Scanner scn = new Scanner(System.in);
        int val1 =  scn.nextInt();
        int val2 =  scn.nextInt();
        int result = blcm.getBasicLCM(val1,val2);
        System.out.println("LCM of "+val1 +" & "+ val2+"Will be :"+ result);
    }
}
