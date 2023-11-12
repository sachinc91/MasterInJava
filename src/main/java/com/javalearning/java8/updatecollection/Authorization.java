package com.javalearning.java8.updatecollection;

public class Authorization {
    public Authorization(String authID) {
        this.authID = authID;
    }

    public String authID;

    @Override
    public String toString() {
        return "Authorization{" + "authID='" + authID + '\'' + '}';
    }
}
