package com.saucelabs.demo;

import com.saucelabs.demo.data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagClosetTest extends AbstractTest {

    @Test
    public void loginWithInvalidCredentialsFails() {

        swagCloset.homePage().load();
        swagCloset.homePage().performLogin(Credentials.USER_INVALID_ALL);
        Assert.assertTrue(swagCloset.homePage().errorMessageIsShown());

    }

}
