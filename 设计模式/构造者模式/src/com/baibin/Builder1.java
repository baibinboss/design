package com.baibin;

public class Builder1 implements Builder {
    private Product product = new Product();
    @Override
    public void builderA() {
        product.add("Builder1组件A");
    }

    @Override
    public void builderB() {
        product.add("Builder1组件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
