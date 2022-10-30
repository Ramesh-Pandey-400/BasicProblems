package com.PracticeJavaWithPandey.ObjectOrientedProgramming.Constructor;

import java.util.Scanner;

public class ParameterizedConstructor {
    //Constructor is called automatically whenever a object is created for that object
    //creating Parametrized Constructor with Passing string as parameter in Constructor
    public ParameterizedConstructor(String brand) {
        System.out.println("Parametrised Constructor called!!!!! \nCar Brand Name : " + brand);
    }
    public static void main(String[] args) {
        System.out.println("Enter Brand Name of Car");
        Scanner scn =new Scanner(System.in);
        String brandname = scn.next();
        ParameterizedConstructor carbrand = new ParameterizedConstructor(brandname);
    }
}
