package com.automation.appium.Screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.getDriver;

public class PickCityScreen {

    public PickCityScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(id = "skip")
    private AndroidElement skipBtn;

    @AndroidFindBy(id = "pickCityButton")
    private AndroidElement pickCityBtn;

    public void skipCitySelection() {
        skipBtn.click();
    }
}
