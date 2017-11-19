package com.baibin;

public class Director {
    private Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.builderA();
        builder.builderB();
    }
}
