package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString obj;
    @Before
    public void setUp() throws Exception {
         obj = new TransposeString();

    }

    @After
    public void tearDown() throws Exception {
         obj= null;
    }

    @Test
    public void reserveWords() {
        String  input = "a quick brown fox jumps over the lazy dog";
        String result = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(result,obj.reserveWords(input));
    }

    @Test
    public void reserveWordsTest1() {
        String input = "stackroute";
        String result = "etuorkcats";
        assertEquals(result,obj.reserveWords(result));
    }

    @Test
    public void reserveWordsTest2() {
        String input = "boeing";
        String result = "gnieob";
        assertEquals("",obj.reserveWords("boeing"));
    }
    @Test
    public void reserveWordsTest3() {
        String input = "boeing";
        String result = "gnieob";
        assertNotEquals(result,obj.reserveWords(input));
    }


}