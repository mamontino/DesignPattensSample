package com.adrugroupe.testproject.inner_classes;

class Inner {

    private static String valStatic = "100";
    private final String valFinal = "100";
    private String valPrivate = "100";

    public static class SampleInnerStatic {

        private int val = 10;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void printVal() {
            System.out.println(valStatic);
        }
    }

    public class SampleInnerPublic {

        private int val = 10;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void printVal() {
            System.out.println(val);
        }
    }

    public interface SampleInnerAnonymous {
        void printVal();
    }

    static void setSampleInnerAnonymous(SampleInnerAnonymous anonymous) {
        anonymous.printVal();
    }
}
