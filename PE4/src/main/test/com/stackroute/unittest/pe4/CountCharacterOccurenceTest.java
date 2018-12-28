package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharacterOccurenceTest {

    CountCharacterOccurence obj;
    @Before
    public void setUp() throws Exception {
        obj=new CountCharacterOccurence();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void charOcuurTest(){
        String input="stackrouuuuuuute";
        assertEquals(7,obj.countOccurrence(input,'u',0));
    }

    @Test
    public void charOcuurTest1(){
        String input="Boeeeeing";
        assertEquals(4,obj.countOccurrence(input,'e',0));
    }
    @Test
    public void charOcuurTest2(){
        String input="Swethaaaaaaa";
        assertEquals(6,obj.countOccurrence(input,'a',0));
    }




}