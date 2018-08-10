package com.adrugroupe.testproject.patterns.builder;

public class CarBuilder {

    private  String title = "car";
    private  String transmission = "mechanic";
    private  int speed = 100;

    CarBuilder setTitle(String title){
        this.title = title;
        return this;
    }

    CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }

    CarBuilder setSpeed(int speed){
        this.speed = speed;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setTitle(title);
        car.setTransmission(transmission);
        car.setSpeed(speed);
        return car;
    }
}
