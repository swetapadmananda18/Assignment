package com.nineleaps.assignment4;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamAssignment2 {
    public static void main(String args[]){
        Integer[] array = new Integer[]{3,4,6,12,20};
        List<Integer> list = Arrays.asList(array);
        System.out.println("Before Condition: "+ list);
        List<Integer> result = list.stream().filter(n-> (n *(n+1)/4==5)).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(list);
        System.out.println(list.contains(result.get(0)));
    }
}
//(n->(n * (n + 1)) / 4 == 5)