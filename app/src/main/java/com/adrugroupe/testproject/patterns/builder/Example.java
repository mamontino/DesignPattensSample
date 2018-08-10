package com.adrugroupe.testproject.patterns.builder;

public class Example {

    void createCar(){
        Car car = new CarBuilder()
                .setSpeed(150)
                .setTitle("BMW")
                .setTransmission("AUTO")
                .build();
    }
}
