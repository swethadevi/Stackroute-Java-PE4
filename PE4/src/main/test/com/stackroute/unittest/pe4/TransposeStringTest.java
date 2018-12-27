package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString obj;
    @Before
    public void setUp() throws Exception {
        TransposeString obj = new TransposeString();

    }

    @After
    public void tearDown() throws Exception {
        TransposeString obj= null;
    }

    @Test
    public void reserveWords() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",obj.reserveWords("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void reserveWordsTest1() {
        assertEquals("etuorkcats",obj.reserveWords("stackroute"));
    }
    @Test
    public void reserveWordsTest2() {
        assertEquals("gnieob",obj.reserveWords("boeing"));
    }
    @Test
    public void reserveWordsTest3() {
        assertNotEquals("gnieob",obj.reserveWords("boeing"));
    }


}