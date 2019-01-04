package com.saucelabs.demo;

import com.saucelabs.demo.data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends AbstractTest {

    @Test
    public void addItemToBasket() {
        swagCloset.loginPage().load();
        swagCloset.loginPage().performLogin(Credentials.USER_VALID);
        swagCloset.storePage().addFirstProductToBasket();
        swagCloset.storePage().navigateToCart();
        Assert.assertEquals(1, swagCloset.checkoutPage().basketCount());
    }

}
