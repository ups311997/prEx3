package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    Consecutive mat;
    @Before
    public void setUp() throws Exception {
        mat= new Consecutive();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void success1() {
        boolean expected=false;

        boolean actual = mat.checkConsecutive("98,96,95,94,93");
        assertEquals(expected,actual);
    }
    @Test
    public void success2() {
        boolean expected=true;

        boolean actual = mat.checkConsecutive("54,53,52,51,50,49,48");
        assertEquals(expected,actual);
    }
    @Test
    public void success3() {
        boolean expected=false;

        boolean actual = mat.checkConsecutive("1,2,3,4,5,6,6");
        assertEquals(expected,actual);
    }




}