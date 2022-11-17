package com.PracticeJavaWithPandey.ObjectOrientedProgramming.DateAndTime;

import java.sql.Timestamp;

public class SampleTimeStamp {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Timestamp is : "+timestamp.getTime());
    }
}
