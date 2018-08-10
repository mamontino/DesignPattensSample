package com.adrugroupe.testproject.patterns.prototype;

public class Cookie implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
