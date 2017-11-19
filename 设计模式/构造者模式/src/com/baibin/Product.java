package com.baibin;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> component = new ArrayList<>();

    public void add(String part) {
        component.add(part);
    }

    public void show() {
        System.out.println("展示组件");
        for (String part : component) {
            System.out.println(part);
        }
    }
}
