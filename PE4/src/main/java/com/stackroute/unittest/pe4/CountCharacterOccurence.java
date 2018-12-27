package com.stackroute.unittest.pe4;

import java.util.*;
/*
        Write a java program to count the total number of occurrences of a given character in a ​ string
    without using any loop?
 */



public class CountCharacterOccurence {
    public static void main(String[] args) {
        String str1 = "Swetha Devi D";
        String resString = "t";
        characterCount(str1,resString);

    }

    public static int characterCount(String str1,String resString){
        int count = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == resString.charAt(0)){
                count++;
               // System.out.println(count);
            }
        }
        System.out.println("The occurence of e is "+count);
        return count;

    }
}
