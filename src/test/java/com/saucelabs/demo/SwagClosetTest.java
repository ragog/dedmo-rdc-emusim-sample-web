package com.saucelabs.demo;

import com.saucelabs.demo.data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagClosetTest extends AbstractTest {

    @Test
    public void loginWithInvalidCredentials() {

        swagCloset.loginPage().load();
        swagCloset.loginPage().performLogin(Credentials.USER_INVALID_ALL);
        Assert.assertTrue(swagCloset.loginPage().errorMessageIsShown());

    }
    @Test
    public void loginWithValidCredentials() {

        swagCloset.loginPage().load();
        swagCloset.loginPage().performLogin(Credentials.USER_VALID);
        Assert.assertTrue(swagCloset.productPage().isActive());

    }

}
