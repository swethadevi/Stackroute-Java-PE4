package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTextTest {

    @Test
    public void checkSuccess () {
        ParagraphText obj = new ParagraphText();
        String input = "String is a sequence of characters.In java, objects of String are immutable which means a constant and cannot be changed once created.";
        String sortedString = " a a and are be cannot changed characters constant created immutable in is java means objects of of once sequence string string which ";
        assertEquals(sortedString,obj.alphabeticalOrder(input));
    }
    @Test
    public void checkFailure () {
        ParagraphText obj = new ParagraphText();
        String input = "String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.";
        String sortedString = "a characters is of sequence string.";
        assertNotSame(sortedString,obj.alphabeticalOrder(input));
    }
    @Test
    public void checkNotNull () {
        ParagraphText obj = new ParagraphText();
        String input = "string is a sequence of characters.";
        String sortedString = "a characters is of sequence string ";
        assertNotNull(sortedString,obj.alphabeticalOrder(input));
    }
}