package com.PracticeJavaWithPandey.ObjectOrientedProgramming.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(333);
        myNumbers.add(150);
        myNumbers.add(200);
        myNumbers.add(340);
        myNumbers.add(800);
        myNumbers.add(122);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
