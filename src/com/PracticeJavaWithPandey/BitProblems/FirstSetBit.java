package com.PracticeJavaWithPandey.BitProblems;

import java.util.Scanner;

public class FirstSetBit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int result = getFirstSetBit(num);
        System.out.println("Position of First Set of Number "+num+" is = "+result);
    }

    public static int getFirstSetBit(int n){

        int count = 0;
        int result = 0;
        while(n!=0){
            count++;
            if(n%2==1){
                result = count;
                break;
            }
            n = n/2;
        }
        return result;
    }
}
