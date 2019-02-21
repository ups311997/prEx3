package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyplacesTest {
    Myplaces mat;
    @Before
    public void setUp() throws Exception {
        mat= new Myplaces();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
       String[] expected={"nd","ntd Stts","Grmny","gypt","czchslvk"};
       String[] s1={"India","United States","Germany","Egypt","czechoslovakia"};

        String[] actual = mat.removeVowels(s1);
        assertArrayEquals(expected,actual);
    }





}

