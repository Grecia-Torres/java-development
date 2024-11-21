package com.pluralsight.week7;

public class Tester <T,U> {
    private T t;
    private U u;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public Tester(T t, U u) {
        this.t = t;
        this.u = u;
    }
}
