package com.PracticeJavaWithPandey.ObjectOrientedProgramming.Destructor;

public class Destructure {
    protected void finalize(){
        System.out.println("Destructor Called!!");
    }
    public static void main(String[] args) {
        Destructure ds = new Destructure();
        ds.finalize();
    }
}
