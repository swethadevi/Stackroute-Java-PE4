package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountMultipleOccurenceTest {


    CountCharacterOccurence obj;
    @Before
    public void setUp() throws Exception {
        CountCharacterOccurence obj = new CountCharacterOccurence();
    }

    @After
    public void tearDown() throws Exception {
        CountCharacterOccurence obj = null;
    }


//    @Test
//    public void findMultipleOccurrence() {
//        assertEquals("4-6-10-12-27-29-",obj.findMultipleOccurrence("She sells seashells by the seashore"));
//    }
}