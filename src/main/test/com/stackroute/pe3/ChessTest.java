package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {

        Chess mat;
        @Before
        public void setUp() throws Exception {
            mat= new Chess();
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void success() {



                String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

                String [][] actual = mat.checkChess(8,8);

                assertNotEquals("Following is chessPattern output",expected,actual);
            }

}





