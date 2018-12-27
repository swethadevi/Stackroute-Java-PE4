package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharacterOccurenceTest {

    CountCharacterOccurence obj;

    @Before
    public void setUp() throws Exception {
        CountCharacterOccurence obj = new CountCharacterOccurence();

    }

    @After
    public void tearDown() throws Exception {
        CountCharacterOccurence obj = null;
    }

    @Test
    public void characterCount() {
        assertEquals(2,obj.characterCount("Swetha Devi D","D"));
    }
    @Test
    public void characterCount1() {
        assertEquals(2,obj.characterCount("Stackroute","t"));
    }
    @Test
    public void  characterCount2(){
        assertNotEquals(2,obj.characterCount("Boeing","c"));

    }
}