package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLetterTest {

    ReplaceLetter obj;
    @Before
    public void setUp() throws Exception {
        ReplaceLetter obj = new ReplaceLetter();
    }

    @After
    public void tearDown() throws Exception {
        ReplaceLetter obj = null;
    }

    @Test
    public void replaceLettertest() {
        assertEquals("faily fry",obj.replaceLetter("daily dry") );
    }

    @Test
    public void replaceLettertest1() {
        assertEquals("fevice fish",obj.replaceLetter("device dish") );
    }
}