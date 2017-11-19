package com.baibin;

import java.text.MessageFormat;

public class ConcreteObserver extends Observer {
    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(MessageFormat.format("观察者{0}的新状态{1}",name,observerState));
    }
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

}
