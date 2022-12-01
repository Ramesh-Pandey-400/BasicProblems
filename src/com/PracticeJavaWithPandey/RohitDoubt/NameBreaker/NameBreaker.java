package com.PracticeJavaWithPandey.RohitDoubt.NameBreaker;

public class NameBreaker {
    public static void main(String[] args) {
        String name = "Ramesh Pandey";
        String firstName  = " ";
        String lastName  = " ";

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==' ' ){
                firstName = name.substring(0,i);
                lastName = name.substring(i+1, name.length());
            }

        }

        System.out.println("First Name is :"+firstName);
        System.out.println("First Name is :"+lastName);
    }
}
