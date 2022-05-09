package com.javalearning.glob;

final public class Employee implements Cloneable {

    private String name;
    private int empID;
    private Address addess;
    private Employee employee;
//
//    public Employee(String name,){
//
//    }

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public Address getAddess() {
        Address tmpAddress = new Address();
        tmpAddress.city = this.addess.city;
        return tmpAddress;
    }

}
