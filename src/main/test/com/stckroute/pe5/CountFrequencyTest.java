package com.stckroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountFrequencyTest {

    //Instantiates the class
    CountFrequency test;

    @Before
    public void setUp() throws Exception {
        test =new CountFrequency();
    }

    @After
    public void tearDown() throws Exception {
        test=null;
    }

    //test cases for integers written in word as input
    @Test
    public void integerTest(){
        String result=test.countWordFrequency("one one , two _ two,, three ,four ,six ,nine, five ,four,  one");
        assertEquals("{nine=1, six=1, four=2, one=3, two=2, three=1, five=1}",result);
    }

    //Test cases for word as input
    @Test
    public void nameTest(){
        String result=test.countWordFrequency("jam name ,,king , name , jam  , king,  king");
        assertEquals("{king=3, jam=2, name=2}",result);
    }

    //Test cases for numbers as input
    @Test
    public void numberTest(){
        String result=test.countWordFrequency("123 456 736 ,,, 5647, 123 , 9, 4= 9");
        assertEquals("{123=2, 4=1, 456=1, 9=2, 736=1, 5647=1}",result);
    }
}
