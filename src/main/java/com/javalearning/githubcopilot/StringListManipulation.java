package com.javalearning.githubcopilot;

import java.util.ArrayList;
import java.util.List;

public class StringListManipulation {

    List<String> stringList = new ArrayList<>();

    public StringListManipulation(){
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Learning");
        stringList.add("Github");
        stringList.add("Copilot");
    }

    // sort stringList and print
    public List<String> sortAndReturn() {
        stringList.sort(String::compareTo);
        return stringList;
    }

    // get and print unique characters from stringList
    public void getUniqueCharacters() {
        stringList.stream().flatMapToInt(String::chars).distinct().forEach(System.out::println);
    }

    // print extra characters from stringList
    public void getExtraCharacters() {
        stringList.stream().flatMapToInt(String::chars).distinct().forEach(System.out::println);
    }

    // print sting with special characters from stringList
    public void getSpecialCharacters() {
        stringList.stream().flatMapToInt(String::chars).distinct().forEach(System.out::println);
    }

    //

}
