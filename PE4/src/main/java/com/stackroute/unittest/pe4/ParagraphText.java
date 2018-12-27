package com.stackroute.unittest.pe4;
import java.util.*;

/*
        Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
    a. Extract the words from the text and sort them into alphabetical order.
    b. Display the sorted list of words.
 */


public class ParagraphText {
    public static void main(String args[]){
        String str = "Extract the words from the text and sort them into alphabetical order";
        paragraphSort(str);
    }
    public static String[] paragraphSort(String str){
        int i, j;
        String sortArray[] = str.split(" ");
        String temp = "";
        for(i=0; i<sortArray.length; i++)
        {
            for(j=1; j<sortArray.length; j++)
            {
                if(sortArray[j-1].compareTo(sortArray[j])>0)
                {
                    temp=sortArray[j-1];
                    sortArray[j-1]=sortArray[j];
                    sortArray[j]=temp;
                }
            }
        }
        //System.out.println(sortArray);
        return sortArray;
    }

}



