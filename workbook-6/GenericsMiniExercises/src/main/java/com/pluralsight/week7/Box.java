package com.pluralsight.week7;

public class Box <T>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Box() {

    }
}
