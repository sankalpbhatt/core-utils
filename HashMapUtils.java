package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapUtils {

    private Map<String, String> stringMap;

    public void iterateThroughMap(){

        //Method 1 using for each
        for(Map.Entry<String , String> entry : stringMap.entrySet()){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }

        // Method 2 : Using stream

        stringMap.entrySet().forEach( System.out::println );
    }

    public void initializeMap(){
        //Method 1
        stringMap = new HashMap<String, String>();
        stringMap.put("One","1");
        stringMap.put("Two","2");
        stringMap.put("Three","3");
    }


}
