package com.stackroute.unittest.pe4;
import java.util.*;
/*
        Write a program to transpose the given ​ string​ .
    Input ​ String​ : a quick brown fox jumps over the lazy dog
    Output ​ String​ : a kciuq nworb xof spmuj revo eht yzal god

 */

public class TransposeString {

    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        String str = "a quick brown fox jumps over the lazy dog";
        System.out.println(reserveWords(str));
    }

    public static String reserveWords(String str){
        StringBuilder bf = new StringBuilder();
        bf.append(str); // appending the string to the buffer
        bf = bf.reverse(); //to reverse the string buffer

        str = bf.toString(); //to convert the buffer object to String
        String arrStr[] = str.split(" "); //to split the string with a  spcae " "
        int i;
        String resStr = "";
        for (i=arrStr.length-1; i>=0; i--){ //to loop through the array of string
            resStr = resStr + arrStr[i] + " ";
        }
        return resStr.trim();
    }

}
