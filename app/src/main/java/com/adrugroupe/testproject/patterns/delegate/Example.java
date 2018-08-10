package com.adrugroupe.testproject.patterns.delegate;

class Example {

    void draw() {
        Painter mPainter = new Painter();
        mPainter.setGraphics(new Triangle());
        mPainter.draw();
        mPainter.setGraphics(new Square());
        mPainter.draw();
        mPainter.setGraphics(new Circle());
        mPainter.draw();
    }
}
