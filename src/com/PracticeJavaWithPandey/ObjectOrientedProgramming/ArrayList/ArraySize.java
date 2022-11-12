package com.PracticeJavaWithPandey.ObjectOrientedProgramming.ArrayList;

import java.util.ArrayList;

public class ArraySize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ramesh");
        names.add("Rohit");
        names.add("Akash");
        names.add("Naveen");
        names.add("Yogesh");
        names.add("Balraj");

        //size of arraylist

        System.out.println("size of given arraylist "+names.size());

    }
}
