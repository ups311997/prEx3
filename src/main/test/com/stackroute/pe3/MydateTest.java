package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class MydateTest {




        Mydate app;
        @BeforeClass
        public static void setUpOnce(){


        }

        @AfterClass
        public static void teardownOnce(){


        }
        @Before
        public void setUp(){

            app=new Mydate();
        }

        @After
        public void tearDown(){

            app=null;
        }
        @Test
        public void test1() throws Exception {
            //Arrange
            boolean expectedValue=true;

            //Act
            boolean actualValue= app.checkDate();
            //Assert
            assertEquals(expectedValue, actualValue);
            assertNotNull(actualValue);
        }
    @Test
    public void test2() throws Exception {
        //Arrange
        boolean expectedValue=true;

        //Act
        boolean actualValue= app.endDate();
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }



}


