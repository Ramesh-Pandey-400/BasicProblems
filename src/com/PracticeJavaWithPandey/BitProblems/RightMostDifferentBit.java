package com.PracticeJavaWithPandey.BitProblems;

import java.util.Scanner;

public class RightMostDifferentBit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int result = positionOfRightMostDiffBit(number1,number2);

        System.out.println("Position of Rightmost Different Bit in Binary Representation of Numbers is "+result);
    }

    public static int positionOfRightMostDiffBit(int m, int n)
    {
        int count = 0;
        int result = 0;

        if(m==n){
            return -1;
        }

        else{
            while (m!=0 || n!=0){
                if((m%2) == (n%2)){
                    count++;
                    n=n/2;
                    m=m/2;
                }
                else{
                    break;
                }


            }

            return count+1;
        }

    }

}
