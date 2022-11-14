package com.PracticeJavaWithPandey.ObjectOrientedProgramming.UserInput;

import java.util.Scanner;

public class UserInput {
        public static void main(String[] args) {
            Scanner scn  = new Scanner(System.in);
            System.out.println("Enter Your Name");

            String userName = scn.nextLine();
            System.out.println("You Entered your name as  " + userName);
        }
}
