package com.baibin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(new Consumer<Observer>() {
            @Override
            public void accept(Observer observer) {
                observer.update();
            }
        });
    }
}
