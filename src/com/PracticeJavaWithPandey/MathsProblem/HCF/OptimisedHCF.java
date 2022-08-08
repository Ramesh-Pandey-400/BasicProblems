package com.PracticeJavaWithPandey.MathsProblem.HCF;

public class OptimisedHCF {
    int HCF=0;
    int xResult = 0 ;
    //Method to return Optimised HCF of two number taken in function Parameter
    //Example  : 10 & 20......... 10=1,2,5,"10" & 20= 1,2,4,5,"10",20  hcf is 10
    int getOptimisedHcf(int num1, int num2){
        /*
        10,15
        15,10
        10,5
        5,0

        18 - 1,2,3,6,9,18
        60 - 1,2,3,4,5,6,10,12,15,20,30,60

        18,60
        60,18
        18,6
        6,0
         */
        if(num2==0){
            return num1;
        }
        return getOptimisedHcf(num2,num1%num2);
    }
    public static void main(String[] args) {
        OptimisedHCF ohcf = new OptimisedHCF();
        int result = ohcf.getOptimisedHcf(12,15);
        System.out.println(result);
    }
}
