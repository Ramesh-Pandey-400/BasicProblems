package com.PracticeJavaWithPandey.ObjectOrientedProgramming.Inheritance;
class Vehicle {
    void info(){
        System.out.println("All Vehicles have Tyres");
    }
}
public class TwoWheeler extends Vehicle{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        TwoWheeler twoWheeler = new TwoWheeler();
        //calling info method of Vehicle class
        twoWheeler.info();
    }
}

