package com.stckroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsOnArrayListTest {

    //Instantiating the class
    OperationsOnArrayList test;

    @Before
    public void setUp() throws Exception {
        test = new OperationsOnArrayList();
    }

    @After
    public void tearDown() throws Exception {
        test=null;
    }


    //Tset cases for updating the values in the list
    @Test
    public void wordsInitialisationTest(){
        String result=test.initialiseArrayList("Abdul ram Inzamam Alex John");
        assertEquals("[Abdul, ram, Inzamam, Alex, John]",result);
    }


    //Test cases for clearing the list
    @Test
    public void wordsRemovalTest(){
        String result=test.removeArrayList();
        assertEquals("[]",result);
    }


    //Test cases for Updating an element at specific index
    @Test
    public void wordAtSpecificIndexTest(){
        String str=test.initialiseArrayList("Abdul ram Inzamam Alex John");
        String result=test.addSpecificIndex(2,"Rohit");
        assertEquals("[Abdul, ram, Rohit, Alex, John]",result);
    }
}