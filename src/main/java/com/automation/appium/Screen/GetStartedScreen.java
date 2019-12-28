package com.automation.appium.Screen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.getDriver;

public class GetStartedScreen {
    public GetStartedScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

//     Registration scenario is up

    @AndroidFindBy(id = "email")
    private AndroidElement emailTxtField;

    @AndroidFindBy(id = "getStartedButton")
    private AndroidElement getStartedBtn;

    @AndroidFindBy(id="skipTextView")
    private AndroidElement skipForNowbtn;


    public void proceedsToRegistration() {
        emailTxtField.sendKeys(RandomStringUtils.randomAlphabetic(7)+"@mailinator.com");
        getStartedBtn.click();
    }
}
