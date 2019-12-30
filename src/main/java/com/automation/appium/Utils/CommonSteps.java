package com.automation.appium.Utils;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;

import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.WaitUtils.waitForVisible;

public class CommonSteps {
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void clickOnElement(AndroidElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void sendKeysTo(AndroidElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }
}
