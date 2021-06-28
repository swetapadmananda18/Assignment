package com.nineleaps.assignment3;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    HashMap<Integer,String> maps=new HashMap<>();
    Maps(){
        maps.put(1,"ONE");
        maps.put(2,"TWO");
    }
    void display(){
        //With Iterator
        Iterator it = maps.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
        //traversing through ForEach
        maps.forEach((key,value) -> System.out.println(key + " : " + (value)));
    }
}