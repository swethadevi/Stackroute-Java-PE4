package com.stackroute.unittest.pe4;
import java.util.*;
/*
    Write a program to replace all d with f and all l with t in the given ​ String
 */


public class ReplaceLetter {
    public static void main(String[] args) {
        String str="daily dry"; // original string
        replaceLetter(str); // calling the replace string function

    }

    public static String replaceLetter(String str){
            String replacedStr=str.replaceAll("d","f"); //to replace the original string with 'd' and 'f'
        System.out.println(replacedStr); //replaced string
            return replacedStr;
        }

    }

