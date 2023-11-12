package com.javalearning.java8.updatecollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Authorization authorization1 = new Authorization("20");
        Authorization authorization2 = new Authorization("30");
        Authorization authorization3 = new Authorization("40");

        List<Authorization> list = new ArrayList<>();
        list.add(authorization1);
        list.add(authorization2);
        list.add(authorization3);

        list.stream().forEach(System.out::println);
        Optional<Authorization> tncResponseDtoOptional = list.stream().filter(t -> t.authID.equals("20")).findFirst();
        tncResponseDtoOptional.get().authID = "10";
        list.stream().forEach(System.out::println);
    }
}
