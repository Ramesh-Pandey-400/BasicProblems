package com.PracticeJavaWithPandey.ObjectOrientedProgramming.Encapsulation;

class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Ramesh");
        System.out.println(myObj.getName());
    }
}
