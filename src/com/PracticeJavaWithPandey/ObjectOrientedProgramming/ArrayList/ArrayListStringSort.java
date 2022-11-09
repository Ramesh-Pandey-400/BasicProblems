package com.PracticeJavaWithPandey.ObjectOrientedProgramming.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringSort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ramesh");
        names.add("Rohit");
        names.add("Akash");
        names.add("Naveen");
        names.add("Yogesh");
        names.add("Balraj");

        Collections.sort(names);  // Sort myNumbers

        for (String i : names) {
            System.out.println(i);
        }
    }
}
