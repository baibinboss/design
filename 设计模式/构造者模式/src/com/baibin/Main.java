package com.baibin;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder1();
        Director director = new Director();
        director.setBuilder(builder);
        director.construct();
        Product result = builder.getResult();
        result.show();
    }
}
