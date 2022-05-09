package com.javalearning.immutable;

public class Car {

    private String registrationNo;
    private String model;

    public Car(String registrationNo, String model) {
        this.registrationNo = registrationNo;
        this.model = model;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNo='" + registrationNo + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
