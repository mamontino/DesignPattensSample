package com.adrugroupe.testproject.patterns.delegate;

public class Square implements Graphics {

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
