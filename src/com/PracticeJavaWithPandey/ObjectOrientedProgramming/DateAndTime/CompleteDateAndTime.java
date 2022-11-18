package com.PracticeJavaWithPandey.ObjectOrientedProgramming.DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompleteDateAndTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting: " + formattedDate);
    }
}
