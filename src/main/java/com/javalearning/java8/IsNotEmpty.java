package com.javalearning.java8;

import org.springframework.util.StringUtils;

import java.util.Set;
import java.util.stream.Collectors;

public class IsNotEmpty {

    public static void main(String[] args) {

        Set<String> toEmails = StringUtils.commaDelimitedListToSet("avc,xyz,lll,");

        System.out.println(toEmails.size());
        toEmails = toEmails.stream().filter(e -> !e.isEmpty()).collect(Collectors.toSet());
        System.out.println(toEmails.size());

    }
}
