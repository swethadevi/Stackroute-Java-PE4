package com.stackroute.unittest.pe4;
import java.util.*;
import java.util.StringTokenizer;

/*
        Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
    a. Extract the words from the text and sort them into alphabetical order.
    b. Display the sorted list of words.
 */

public class ParagraphText {
    public  String alphabeticalOrder(String input) {

        input = input.toLowerCase();
        String temp;
        String result;
        String str = "";
        String[] arr = input.split("[,. ]");

        // To sort the string array in alphabetical order
        Arrays.sort(arr);
        for ( int i=0; i<arr.length; i++) {
            str = str+arr[i]+" ";

        }
        System.out.println(str);
        return str;
    }
}


