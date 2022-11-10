package com.PracticeJavaWithPandey.ObjectOrientedProgramming.ArrayList;

import java.util.ArrayList;

public class ArrayListPop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ramesh");
        names.add("Rohit");
        names.add("Akash");
        names.add("Naveen");
        names.add("Yogesh");
        names.add("Balraj");

        //pop or remove 0th element of Arraylist in java
        names.remove(0);

        for (String n : names
             ) {
            System.out.println(n);
        }

    }
}
