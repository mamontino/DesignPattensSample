package com.adrugroupe.testproject.patterns.decorator;

public class MainComponent implements InterfaceComponent {

    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
