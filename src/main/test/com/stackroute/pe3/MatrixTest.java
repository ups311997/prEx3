package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix mat;
    @Before
    public void setUp() throws Exception {
        mat= new Matrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        int[][] expected={{10,10},{10,10},{10,10}};
        int arr1[][]={{1,2},{3,4},{5,6}};
        int arr2[][]={{9,8},{7,6},{5,4}};
        int[][] actual = mat.addMatrix(3,2,arr1,arr2);
        assertArrayEquals(expected,actual);
    }





}