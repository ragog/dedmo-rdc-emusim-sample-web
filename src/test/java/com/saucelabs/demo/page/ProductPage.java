package com.saucelabs.demo.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends AbstractPage {

    private By anchorElementBy = By.cssSelector(".product_label");

    public ProductPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public boolean isActive() {
        try {
            new WebDriverWait(driver, STANDARD_TIMEOUT)
                    .until(ExpectedConditions.visibilityOfElementLocated(anchorElementBy));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
