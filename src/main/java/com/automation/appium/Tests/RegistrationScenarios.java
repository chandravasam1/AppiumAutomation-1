package com.automation.appium.Tests;

import com.automation.appium.DataBean.Direction;
import com.automation.appium.Screen.GetStartedScreen;
import com.automation.appium.Screen.PickCityScreen;
import com.automation.appium.Screen.RegistrationScreen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.CommonUtils.rotateDeviceToLandscapeMode;
import static com.automation.appium.Utils.CommonUtils.rotateDeviceToPotraitMode;
import static com.automation.appium.Utils.DriverUtils.initDriver;
import static com.automation.appium.Utils.DriverUtils.tearDown;

import static com.automation.appium.Utils.ScrollUtils.swipeFunction;

public class RegistrationScenarios {


    @BeforeClass
    public void beforeClassMethod() {
        initDriver();
    }

    @Test(enabled = false)
    public void registartionTest() {
        PickCityScreen pickCityScreen = new PickCityScreen();
        pickCityScreen.skipCitySelection();

        GetStartedScreen getStartedScreen = new GetStartedScreen();
        getStartedScreen.proceedsToRegistration();

        RegistrationScreen registrationScreen = new RegistrationScreen();
        registrationScreen.fillRegistrationInfo();
    }

 //   @Test
    public void swipeDemo() {
    //RegistrationScreen register = new RegistrationScreen();
  //    scrollToElement(register.contactName);
        rotateDeviceToLandscapeMode();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rotateDeviceToPotraitMode();
    }


//   @AfterClass
   public void afterClassMethod() {
     tearDown();
    }
}
