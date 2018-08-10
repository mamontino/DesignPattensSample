package com.adrugroupe.testproject.classes;

public class Child extends Parent {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void say() {
        System.out.println("Child say");
    }

    public void send(){
        System.out.println("Send");
    }
}
