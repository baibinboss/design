package com.baibin;

/**
 * 装饰类
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null) {
            component.show();
        }
    }
}
