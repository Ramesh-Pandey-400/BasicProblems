package com.PracticeJavaWithPandey.RohitDoubt.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,6,7,7};
        int count = 0 ;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i =0 ; i<arr.length ; i++){
            count++;
            map.put(arr[i],count++);
        }

        System.out.println("After Removing duplicates Unique Element of Array are ");

        for (int r:map.keySet()){
            System.out.println(r);
        }

    }
}
