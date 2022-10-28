package com.PracticeJavaWithPandey.ObjectOrientedProgramming;

public class ClassesAndObjects {
    public static void main(String[] args) {

        //creating object of class SampleClass
        SampleClass sc = new SampleClass();
        sc.SampleFunction();
    }
}

//creating sample class
class SampleClass{
    void SampleFunction(){
        System.out.println("This is Hello World Program!");
    }
}
