package com.PracticeJavaWithPandey.RohitDoubt.KillerWin;

import java.util.ArrayList;
import java.util.Scanner;

public class KillerWin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Number of Person");
        int nPerson = scn.nextInt();

        System.out.println("Which Person has Knife");
        int hasKnife = scn.nextInt();


//        ArrayList<Integer> remainingPerson = new ArrayList<>();
//        for(int i = 0 ; i<nPerson; i++){
//            remainingPerson.add(i,i);
//        }
//
//        int arraysize = remainingPerson.size();
//            removeUser(nPerson, hasKnife,remainingPerson,arraysize);
//
//        for(int i = 0 ; i<remainingPerson.size(); i++){
//            System.out.println(remainingPerson.get(i));
//        }






    }


    // method Remove User
    public static void removeUser(int nPerson,int hasKnife,ArrayList<Integer> remainingUser,int arraysize){

        while(hasKnife<=arraysize-2){
            remainingUser.remove(hasKnife+1);
            nPerson = remainingUser.size();
            hasKnife = hasKnife+2;
        }

    }
}
