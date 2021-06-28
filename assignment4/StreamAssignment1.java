package com.nineleaps.assignment4;

import java.util.*;
import java.util.stream.*;
public class StreamAssignment1 {
    public static void main(String args[]){
        Integer[] array = new Integer[]{34,6,3,12,65,1,8};
        List<Integer> list = Arrays.asList(array);
        System.out.println("Before sorting: "+ list);
        List<Integer> sortedArray = list.stream().filter(i -> i > 5).sorted().collect(Collectors.toList());
        System.out.println("After Sorting: "+ sortedArray);
    }
}