package com.stackroute.unittest.pe4;
import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
        Write a program with the implementation of ​ Regular Expression​ to find the presence of the name
    Harry in a ​ string​ .
    Input: This is Harry.
    Output: Is Harry here ? true
    Input : This is Henry.
    Output: Is Harry here ? false
 */

public class HarryCheck {

    public static boolean toCheckPresence(String str){
        String regex = "\\bHarry\\b"; // creating regex of Harry
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // pattern for regex
        Matcher matcher = pattern.matcher(str); // to check if pattern matches with given String
        if(matcher.find()){ //to check if the matcher has the "Harry" using find() function
            return true;
        }
        return false;
    }

}
