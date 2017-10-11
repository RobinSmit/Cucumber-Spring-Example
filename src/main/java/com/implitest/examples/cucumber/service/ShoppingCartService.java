package com.implitest.examples.cucumber.service;

import com.implitest.examples.cucumber.service.products.Product;

public interface ShoppingCartService {

    double getCartTotal();

    void setCartTotal(double cartTotal);

    void addToCart(Product product);

    void removeFromCart(Product product);


}
