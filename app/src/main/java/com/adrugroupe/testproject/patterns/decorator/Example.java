package com.adrugroupe.testproject.patterns.decorator;

public class Example {

    public static void main (String... s) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new DecoratorHello(new MainComponent()))));
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation
    }
}
