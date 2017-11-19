package com.baibin;

public class Builder2 implements Builder {
    private Product product = new Product();
    @Override
    public void builderA() {
        product.add("Builder2组件A");
    }

    @Override
    public void builderB() {
        product.add("Builder2组件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
