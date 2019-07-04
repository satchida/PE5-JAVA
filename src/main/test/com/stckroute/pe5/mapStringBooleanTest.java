package com.stckroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mapStringBooleanTest {

    //Instantiate the class
    MapStringBoolean obj;

    @Before
    public void setUp() throws Exception {
        obj=new MapStringBoolean();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }


    //Test cases containing multiple words
    @Test
    public void multipleWord(){
        String[] arr1={"alex","abraham","john","alex","john"};
        String result=obj.mappingKey(arr1);
        assertEquals("{alex=false, john=false, abraham=false}",result);
    }

    //Test cases containing single words
    @Test
    public void singleWord(){
        String[] arr1={"alex"};
        String result=obj.mappingKey(arr1);
        assertEquals("{alex=false}",result);
    }

    //Test cases containing single words
    @Test
    public void onlyNull(){
        String[] arr1={};
        String result=obj.mappingKey(arr1);
        assertEquals(null,result);
    }
}