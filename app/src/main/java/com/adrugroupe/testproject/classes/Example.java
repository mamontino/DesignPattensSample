package com.adrugroupe.testproject.classes;

public class Example {

    public static void main(String[] args) {
        Parent child = new Child();
        child.say();

        Child child1 = new Child();
        child1.send();
    }
}
