package com.stackroute.unittest.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

public class CountMultipleOccurence {
    
        public String multipleOccurence (String input, String pattern) {
            Pattern patternCheck = Pattern.compile(pattern);
            Matcher matcher = patternCheck.matcher(input);
            String str ="";
            int count = 0;
            while (matcher.find()) {

                count++;
                //System.out.println("Found at:" + matcher.start() + "-" + matcher.end());
                str=str+("Found at:" + matcher.start() + "-" + matcher.end());
            }

            System.out.println(str);
            return str;

        }
}
