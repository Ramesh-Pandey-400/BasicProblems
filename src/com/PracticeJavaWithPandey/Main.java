package com.PracticeJavaWithPandey;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        a++;
        System.out.println(a);
        System.out.println(b);

//        int arr1[]= {1,2,3,4};
//        int arr2[]= arr1;
//        int sizeofarr1 = arr1.length;
//
//         System.out.println(Arrays.toString(arr1));
//      System.out.println(Arrays.toString(arr2));
//        int newArr1[] = new int[arr1.length+1];
//        arr1 = newArr1;
//        arr1[sizeofarr1] = 5;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//
//

        ArrayList <Integer>arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        ArrayList <Integer>arr2 = new ArrayList<>();
        arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        arr1.add(4);
        System.out.println(arr1);
        System.out.println(arr2);



    }
}
