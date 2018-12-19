package com.saucelabs.demo;

import com.saucelabs.demo.page.LoginPage;
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

}
