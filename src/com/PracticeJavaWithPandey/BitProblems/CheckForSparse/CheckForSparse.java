package com.PracticeJavaWithPandey.BitProblems.CheckForSparse;

import java.util.Scanner;

public class CheckForSparse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean result =  isSparse(num);
        if(!result){
            System.out.println("Not Sparse!!");
        }
        else{
            System.out.println("Sparse!!");
        }
    }


    public static boolean isSparse(int n)
    {
        boolean result = true;
        int count =0;
        while(count<2){
            if(n%2==1){
                count++;
                result = false;
            }
            else{
                count = 0;
            }
            n = n/2;
        }
        return result;
    }

}
