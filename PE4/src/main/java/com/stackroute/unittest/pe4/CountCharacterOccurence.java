package com.stackroute.unittest.pe4;

import java.util.*;
/*
        Write a java program to count the total number of occurrences of a given character in a ​ string
    without using any loop?
 */



public class CountCharacterOccurence {
    public long countOccurrence(String input, final char check,int index) {
        if (index >= input.length()) {
            return 0;
        }

        int count = input.charAt(index) == check ? 1 : 0;
        return count + countOccurrence(input, check, index + 1);
    }


}
