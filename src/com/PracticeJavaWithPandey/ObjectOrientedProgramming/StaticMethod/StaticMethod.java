package com.PracticeJavaWithPandey.ObjectOrientedProgramming.StaticMethod;

class SampleClass{

}

public class StaticMethod {
    //creating normal/public method
    public String getPublicName(){
        return "This name can only  be called using Object";
    }
    //creating static  method
    static String  getStaticName(){
        return "This name can  be called Without any help of Object";
    }
    public static void main(String[] args) {
        //creating object
        StaticMethod sm = new StaticMethod();
        System.out.println("Method Called with Object: --->"+sm.getPublicName());
        System.out.println("Method Called without Object: --->"+getStaticName());
    }

}
