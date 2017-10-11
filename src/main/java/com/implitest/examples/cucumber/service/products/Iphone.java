package com.implitest.examples.cucumber.service.products;

public class Iphone implements Product {

    @Override
    public String name() {
        return "Apple Iphone";
    }

    @Override
    public double price() {
        return 900;
    }
}
