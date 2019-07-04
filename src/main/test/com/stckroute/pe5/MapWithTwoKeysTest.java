package com.stckroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapWithTwoKeysTest {

    //Instantiating the class
    MapWithTwoKeys test;

    @Before
    public void setUp() throws Exception {
        test = new MapWithTwoKeys();
    }

    @After
    public void tearDown() throws Exception {
        test=null;
    }


    //These test cases rotate the values of two keys
    @Test
    public void rotateValue() {
        String expected="{val2=java, val1= }";
        Map<String,String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=test.replaceValue(map);
        assertEquals(expected,actual);
    }

    @Test
    public void rotateValueSecond() {
        String expected="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=test.replaceValue(map);
        assertEquals(expected,actual);
    }

    @Test
    public void rotateValueNull() {

        String actual=test.replaceValue(null);
        assertNull(actual);
    }
}