package com.PracticeJavaWithPandey.MathsProblem.LCM;

import java.util.Scanner;

public class OptimisedLCM {
        int LCM = 1 ;
        int HCF=1;
        //BAsic appproach to get HCF or GCD of two number
//Example  : 10 & 20......... 10=10,20,30,40,50, & 20= 20,40,60,80 lcm is 20

        int getOptimisedHcf(int val1, int val2){
            int MAX = Math.max(val1,val2);
            if(val2==0){
                return val1;
            }
            return getOptimisedHcf(val2,val1%val2);
        }
        public static void main(String[] args) {
            OptimisedLCM lcm = new OptimisedLCM();
            Scanner scn = new Scanner(System.in);
            int val1 =  scn.nextInt();
            int val2 =  scn.nextInt();
             lcm.HCF = lcm.getOptimisedHcf(val1,val2);
            lcm.LCM = (val1*val2) / lcm.HCF;


            //a*b = hacf*lcm ---- 10,15 -- 10*15 = 5*30

            System.out.println("LCM of "+val1 +" & "+ val2+"Will be :"+ lcm.LCM);
        }
}
