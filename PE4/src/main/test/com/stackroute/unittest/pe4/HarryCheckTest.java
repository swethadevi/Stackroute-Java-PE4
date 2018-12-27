package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryCheckTest {

    HarryCheck obj;
    @Before
    public void setUp() throws Exception {
        HarryCheck obj = new HarryCheck();
    }

    @After
    public void tearDown() throws Exception {
        HarryCheck obj = null;
    }

    @Test
    public void toCheckPresence() {
        assertEquals(true, obj.toCheckPresence("this is Harry"));
    }

    @Test
    public void toCheckPresenceTest1() {
        assertEquals(false, obj.toCheckPresence("this is Herry"));
    }

    @Test
    public void toCheckPresenceTest2() {
        assertNotEquals(true, obj.toCheckPresence("this is Harry"));
    }

}