package com.stackroute.unittest.pe4;

/*
    Write a program to find out the multiple occurrences of the given word in a ​ string​ using Matcher
    methods.
    Input : She sells seashells by the seashore
    Given word: se
    Output :
    Found at: 4 - 6
    Found at: 10 - 12
    Found at: 27 - 29
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMultipleOccurence {
    public static void main(String[] args) {
        String sentence = "She sells seashells by the seashore";
        findMultipleOccurrence(sentence);

    }

    public static String  findMultipleOccurrence(String sentence){
        if(sentence==null)
            return null;
            sentence="She sells seashells by the seashore";
        String regex="se";
        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(sentence);
        String result="";
        while(match.find())
            result+=match.start()+"-"+match.end()+"-";
            //System.out.println("The occurences of the se are\n" +result);

        if(result=="")
            return "-1";
        else
            return result;
    }
}
