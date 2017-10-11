package com.implitest.examples.cucumber.service;

import com.implitest.examples.cucumber.service.products.Product;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private double cartTotal;

    @Override
    public double getCartTotal() {
        return cartTotal;
    }

    @Override
    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    @Override
    public void addToCart(Product product) {
        this.cartTotal += product.price();
    }

    @Override
    public void removeFromCart(Product product) {
        if (cartTotal <= 0) {
            this.cartTotal = 0;
        } else {
            this.cartTotal -= product.price();
            if (cartTotal < 0){
                this.cartTotal = 0;
            }
        }
    }
}
