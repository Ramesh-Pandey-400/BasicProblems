package com.PracticeJavaWithPandey.RohitDoubt.LakhSum;

import java.util.ArrayList;
import java.util.Scanner;

public class LakhSumMain {
    public static void main(String[] args) {
        LakhSkeleton ls =  new LakhSkeleton();
        Scanner scn = new Scanner(System.in);
        int noOfInputs = scn.nextInt();

        if(noOfInputs>=1){
            ArrayList<Integer> al =new ArrayList<>();
            for (int i = 0; i<noOfInputs ; i++){
                System.out.println("Enter value "+ (i+1));
                ls.setLakh(scn.nextInt());
                al.add(i,ls.getLakh());
            }

            ArrayList<String> result =new ArrayList<>();
            int resultLakh = 0;
            for (int j = 0; j<noOfInputs  ; j++){
                resultLakh = resultLakh+(al.get(j)*100000);
            }

            System.out.println(resultLakh);

        }


    }

}
