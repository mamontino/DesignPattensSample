package com.adrugroupe.testproject.patterns.delegate;

public class Painter {

    private Graphics mGraphics;

    void setGraphics(Graphics graphics){
        mGraphics = graphics;
    }

    void draw(){
        mGraphics.draw();
    }
}
