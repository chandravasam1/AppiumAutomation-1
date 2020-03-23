package com.automation.appium.Utils;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.automation.appium.Utils.DriverUtils.getDriver;

public class WaitUtils {

    static Long timeout = Long.parseLong("10");
    static WebDriverWait wait = new WebDriverWait((WebDriver) new AppiumFieldDecorator(getDriver()), timeout);

    public static void waitForVisible(AndroidElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForNotVisible(AndroidElement element) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeClickable(AndroidElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeSelected(AndroidElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
