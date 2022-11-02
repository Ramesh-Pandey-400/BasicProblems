package com.PracticeJavaWithPandey.ObjectOrientedProgramming.Constructor;

public class ConstructorLoading {
    //constructor Overloading we have defined two Constructor : 1. Default and 2.Parameterized
    public ConstructorLoading(){
        System.out.println("Default Constructor");
    }
    public ConstructorLoading(String paraCons){
        System.out.println("Parameterized Constructor called by "+paraCons);
    }
    public static void main(String[] args) {
        ConstructorLoading defaultObject = new ConstructorLoading();
        ConstructorLoading paramObject = new ConstructorLoading("Ramesh");
    }
}
