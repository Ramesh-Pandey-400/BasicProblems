package com.PracticeJavaWithPandey.BitProblems.OddOccuringNumber;

public class BasicOddOccuringNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,4,5,3};
        for(int i=0; i<arr.length ; i++){
            int count = 0;
            for (int j = 0; j<arr.length;j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2 != 0 ){
                System.out.println("Number Which is not in Pair is : "+arr[i]);
            }
        }
    }
}
