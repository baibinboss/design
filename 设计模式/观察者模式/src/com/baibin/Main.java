package com.baibin;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("X",s));
        s.setSubjectState("abc");
        s.notifyObserver();
    }
}
