package com.adrugroupe.testproject.patterns.facade;

public class Computer {

    private HDD mHDD;
    private DVD mDVD;
    private Power mPower;

    public Computer() {
        mPower = new Power();
        mHDD = new HDD();
        mDVD = new DVD();
    }

    void copyDVD() {
        mDVD.copy();
    }

    void on() {
        mPower.on();
        mHDD.load();
    }

    void off() {
        mPower.off();
    }
}
