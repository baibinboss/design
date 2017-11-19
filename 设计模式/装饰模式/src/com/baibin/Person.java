package com.baibin;

import java.text.MessageFormat;

public class Person {
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(MessageFormat.format("装扮的{0}",this.name));
    }
}
