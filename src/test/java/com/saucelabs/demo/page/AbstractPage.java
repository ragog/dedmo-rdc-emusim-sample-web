package com.saucelabs.demo.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

/**
 * Created by grago on 27.09.17.
 */
public class AbstractPage {

    protected AppiumDriver<MobileElement> driver;

    private boolean isRDC;

    public AbstractPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofMillis(10000)), this);
        isRDC = (driver.getCapabilities().getCapability("testobject_api_key") != null);
    }

    public void takeScreenshot() {
        if (isRDC) { driver.getScreenshotAs(OutputType.BASE64); };
    }

}
