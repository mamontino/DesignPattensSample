package com.adrugroupe.testproject.inner_classes;

public class Example {

    public static void main(String[] args) {

        Inner.SampleInnerStatic innerStatic = new Inner.SampleInnerStatic();
        innerStatic.printVal();

        Inner inner = new Inner();
        Inner.SampleInnerPublic sampleInnerPublic = inner.new SampleInnerPublic();
        sampleInnerPublic.printVal();

        Inner.SampleInnerPublic sampleInnerPublic2 = new Inner().new SampleInnerPublic();
        sampleInnerPublic.printVal();

        Inner.setSampleInnerAnonymous(new Inner.SampleInnerAnonymous() {
            @Override
            public void printVal() {

            }
        });
    }
}
