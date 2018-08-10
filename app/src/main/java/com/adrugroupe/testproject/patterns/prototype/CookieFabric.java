package com.adrugroupe.testproject.patterns.prototype;

public class CookieFabric {

    private Cookie mCookie;

    public CookieFabric(Cookie cookie) {
        mCookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.mCookie.clone();
    }
}
