package com.adrugroupe.testproject.patterns.prototype;

public class Example {

    void operation() {

        Cookie cookie = null;

        CookieFabric prod1 = new CookieFabric(new CoconutCookie());

        try {
            cookie = prod1.makeCookie();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
