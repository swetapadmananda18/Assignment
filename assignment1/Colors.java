package com.nineleaps.assignment1;


import java.util.ArrayList;

public class Colors {
    ArrayList<String> coloursList = new ArrayList<>();

    Colors() {
        coloursList.add("red");
        coloursList.add("green");
        coloursList.add("blue");
        coloursList.add("yellow");

    }

    void display(){
        for (String color: coloursList
        ) {
            System.out.println(color);
        }
    }
    void isPresent(String element){
        System.out.println("The boolean value for the element in the list is :"+ coloursList.contains(element));
    }
}
