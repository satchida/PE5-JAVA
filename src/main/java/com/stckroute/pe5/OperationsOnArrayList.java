package com.stckroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationsOnArrayList {


    //List is initialised
    List<String> list1=new ArrayList<>();

    //Values are stored in Array list from the string
    public String initialiseArrayList(String string){

        list1= Arrays.asList(string.split("[\\W_]+"));
        return list1.toString();
    }


    //In this method all the elements of the list are cleared
    public String removeArrayList()
    {
        list1.clear();
        return list1.toString();
    }

    //In this method an elemnt gets updated at a specific index
    public String addSpecificIndex(int index,String word)
    {
        list1.set(index,word);
        return list1.toString();
    }
}
