package com.PracticeJavaWithPandey.MathsProblem.LeapYear;

import java.util.Scanner;

public class LeapYear {
        public static void isLeapYear(int year)
        {
            boolean is_leap_year = false;
            if (year % 4 == 0) {
                is_leap_year = true;
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        is_leap_year = true;
                    else
                        is_leap_year = false;
                }
            }
            else
                is_leap_year = false;
            if (!is_leap_year)
                System.out.println(year + " : Non Leap-year");
            else
                System.out.println(year + " : Leap-year");
        }

        public static void main(String[] args)
        {
            System.out.println("Enter Year ????");
            Scanner scn = new Scanner(System.in);

            int year = scn.nextInt();
            isLeapYear(year);
        }

}
