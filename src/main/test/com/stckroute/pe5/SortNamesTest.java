package com.stckroute.pe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortNamesTest {

//Instantiating the class
    SortNames obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj = new SortNames();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    //String containing more than one names
    @Test
    public  void moreThanOneNames(){
        String result=obj.sortArrayListNames("Tim John Alex Abraham Buddha");
        assertEquals("[Abraham, Alex, Buddha, John, Tim]",result);
    }

    //String containing one name
    @Test
    public  void oneName(){
        String result=obj.sortArrayListNames("Tim");
        assertEquals("[Tim]",result);
    }

    //String containig null
    @Test
    public  void noName(){
        String result=obj.sortArrayListNames(null);
        assertEquals(null,result);
    }
}