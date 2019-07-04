package com.stckroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {


    public String countWordFrequency(String string){

        //List initialized and values are stored after splitting the string
        List<String> stringList= Arrays.asList(string.split("[\\W_]+"));

        //Map initialises
        Map<String,Integer> map = new HashMap<>();

        for(String word:stringList)

        {
            //Calculates the ocuurances and updates the frequency
            if(map.containsKey(word))
            {
                map.replace(word,map.get(word)+1);
            }
            else
            {
                map.put(word,1);
            }
        }
        return map.toString();
    }
}
