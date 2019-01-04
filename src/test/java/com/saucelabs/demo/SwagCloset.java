package com.saucelabs.demo;

import com.saucelabs.demo.page.CheckoutPage;
import com.saucelabs.demo.page.LoginPage;
import com.saucelabs.demo.page.StorePage;
import io.appium.java_client.AppiumDriver;

/**
 * Created by grago on 27.09.17.
 */
public class SwagCloset {

    private AppiumDriver driver;

    public SwagCloset(AppiumDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginPage() { return new LoginPage(driver); }

    public StorePage storePage() { return new StorePage(driver); }

    public CheckoutPage checkoutPage() { return new CheckoutPage(driver); }

}
