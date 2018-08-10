package com.adrugroupe.testproject.patterns.delegate;

public class Triangle implements Graphics {

    @Override
    public void draw() {
        System.out.println("draw triangle");
    }
}
