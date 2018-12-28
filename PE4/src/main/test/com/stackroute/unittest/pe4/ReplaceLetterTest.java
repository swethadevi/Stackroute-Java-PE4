package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLetterTest {

    ReplaceLetter obj;
    @Before
    public void setUp() throws Exception {
        obj = new ReplaceLetter();
    }

    @After
    public void tearDown() throws Exception {
         obj = null;
    }

    @Test
    public void replaceLettertest() {
        String input = "daily dry";
        String result = "faily fry";
        assertEquals(result,obj.replaceLetter(input) );
    }

    @Test
    public void replaceLettertest1() {
        String input = "device dish";
        String result = "fevice fish";
        assertEquals(result,obj.replaceLetter(input) );

    }
}