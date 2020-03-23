package com.automation.appium.Screen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.getDriver;

public class PrsonSettings {

    public PrsonSettings(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
}


