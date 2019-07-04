package com.stckroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapStringBoolean {


    //This method taking the string array of words and returns the string
    public String mappingKey(String[] string){

        //Checking for the null character
        if(string.length==0)
        {
            return null;
        }
        else {

            //Initializingthe map
            Map<String, Boolean> map1 = new HashMap<>();

            //loop checking the repetition and placing the values according to the keys
            for (int i = 0; i < string.length; i++) {
                int flag = 0;
                for (int j = i+1; j < string.length; j++) {
                    if (string[i].equals(string[j])) {
                        map1.put(string[i], true);//Inserting in map
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    map1.put(string[i], false);//Inserting in the map
                }

            }
            return map1.toString();
        }
    }
}
