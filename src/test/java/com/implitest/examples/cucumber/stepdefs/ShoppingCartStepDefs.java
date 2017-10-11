package com.implitest.examples.cucumber.stepdefs;

import com.implitest.examples.cucumber.CucumberConfiguration;
import com.implitest.examples.cucumber.service.ShoppingCartService;
import com.implitest.examples.cucumber.service.products.Iphone;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = CucumberConfiguration.class)
public class ShoppingCartStepDefs {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Before
    public void setup(){
        shoppingCartService.setCartTotal(0);
    }

    @Given("^the shopping cart total is (.*)$")
    public void theShoppingCartTotalIs(double total) {
        shoppingCartService.setCartTotal(total);
    }

    @When("^i add (\\d+) Iphone to my shopping cart$")
    public void iAddIphoneToMyShoppingCart(int amountOfIphone) {
        for (int i = amountOfIphone; i != 0; i--){
            shoppingCartService.addToCart(new Iphone());
        }
    }

    @When("^i remove (\\d+) Iphone from my shopping cart$")
    public void iRemoveIphoneFromMyShoppingCart(int amountOfIphone) {
        for (int i = amountOfIphone; i != 0; i--){
            shoppingCartService.removeFromCart(new Iphone());
        }
    }

    @Then("^the shopping cart total should be (.*)$")
    public void theShoppingCartTotalShouldBe(double total) {
        Assert.assertEquals(total, shoppingCartService.getCartTotal(), 0);
    }
}
