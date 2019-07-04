package com.stckroute.pe5;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortNames {

    //This method will take a string and return a string in sorted order
    public String sortArrayListNames(String string)
    {
        //Checking for the null string
        if(string==null)
        {
            return null;
        }
        else{

            //Initialising the Treeset
            SortedSet<String> tree = new TreeSet<>();

            //Storing the string in a string array after splitting
            String[] stringArray=string.split(" ");

            //Counting number of elements in the string
            int length=stringArray.length;

            //Adding the elements in the treeset for sorting
            for(int i=0;i<length;i++)
            {
                tree.add(stringArray[i]);
            }
            //Returning the output string
            return tree.toString();

        }
    }
}
