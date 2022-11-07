package com.PracticeJavaWithPandey.ObjectOrientedProgramming.ArrayList;

//simple program to illustrate ArrayList in Java
import java.util.ArrayList;

public class SimpleArrayList {
        public static void main(String[] args) {
            ArrayList<String> programmingLanguage = new ArrayList<String>();
            programmingLanguage.add("C");
            programmingLanguage.add("C++");
            programmingLanguage.add("Java");
            programmingLanguage.add("Python");
            System.out.println(programmingLanguage);

            System.out.println("Size of ArrayList is "+programmingLanguage.size());
        }
}
