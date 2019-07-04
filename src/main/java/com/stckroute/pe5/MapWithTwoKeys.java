package com.stckroute.pe5;

import java.util.Map;

public class MapWithTwoKeys {


    //This method reads a map and returns the map after replacing the values
    public String replaceValue(Map<String,String> map) {

        //checking whether the map having any elements or not
        if (map == null) {
            return null;
        }
        String val1 = map.get("val1");
        map.replace("val2", val1);
        map.replace("val1", " ");
        return map.toString();
    }
}
