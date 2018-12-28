package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryCheckTest {

    HarryCheck obj;
    @Before
    public void setUp() throws Exception {
         obj = new HarryCheck();
    }

    @After
    public void tearDown() throws Exception {
          obj = null;
    }

    @Test
    public void toCheckPresence() {
    String str = "This is Harry";
    assertEquals("True",obj.toCheckPresence(str));


    }

    @Test
    public void toCheckPresenceTest1()
    {
        String str = "this is Herry";
        assertEquals("false", obj.toCheckPresence("this is Herry"));
    }

    @Test
    public void toCheckPresenceTest2() {
        String str = "This is Harry";
        assertNotEquals("true", obj.toCheckPresence("this is Harry"));
    }

}