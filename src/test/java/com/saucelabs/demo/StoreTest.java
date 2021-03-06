package com.saucelabs.demo;

import com.saucelabs.demo.data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends AbstractTest {

    @Test
    public void navigateToItem() {
        swagCloset.loginPage().load();
        swagCloset.loginPage().performLogin(Credentials.USER_VALID);
        swagCloset.storePage().selectFirstProduct();
        Assert.assertTrue(swagCloset.storePage().isPriceShown());
    }

}
