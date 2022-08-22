package com.PracticeJavaWithPandey.BitProblems.OddOccuringNumber;
//BAsic approach give us Complexity of Big o of N*N but this program give us complexity of Big O of N only
public class OptimisedOddOccuring {
    public static int  getOdd(int [] arr, int number){
        int result = 0;
        for(int i = 0 ; i<number; i++){
            result = result ^ arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,3,3,4,5,4,5,3};
        int result = getOdd(arr,arr.length);
                System.out.println("Number Which is not in Pair is : "+result);
    }
}
