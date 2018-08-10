package com.adrugroupe.testproject.patterns.facade;

class Example {

    void load() {
        Computer computer = new Computer();
        computer.on();
        computer.copyDVD();
        computer.off();
    }

}
