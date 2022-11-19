package com.PracticeJavaWithPandey.ObjectOrientedProgramming.DateAndTime;

import java.time.LocalDate;

public class DayOfWeek {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj.getDayOfWeek());

    }
}
