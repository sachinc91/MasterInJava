package com.javalearning.optional;

import org.springframework.util.Assert;

import java.util.Collections;
import java.util.Optional;

public class OptionalExample {

    String authName;

    public void xxx(String authName){
        this.authName = Optional.of(authName).orElse("Nguyen Van B");
    }

    public static void main(String[] args) {
        OptionalExample example = new OptionalExample();
        example.authName = "";

        try{
            Assert.notEmpty(Collections.emptyList(), "No orders found for key ");
        }catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(example.authName);


    }

}
