package com.automation.appium.Tests;

import com.automation.appium.Screen.GetStartedScreen;
import com.automation.appium.Screen.PickCityScreen;
import com.automation.appium.Screen.RegistrationScreen;
import com.automation.appium.Utils.DriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.DriverUtils.initDriver;
import static com.automation.appium.Utils.DriverUtils.tearDown;

public class RegistrationScenarios {


    @BeforeClass
    public void beforeClassMethod() {
        initDriver();
    }

    @Test
    public void registartionTest() {
        PickCityScreen pickCityScreen = new PickCityScreen();
        pickCityScreen.skipCitySelection();

        GetStartedScreen getStartedScreen = new GetStartedScreen();
        getStartedScreen.proceedsToRegistration();

        RegistrationScreen registrationScreen = new RegistrationScreen();
        registrationScreen.fillRegistrationInfo();




    }

    @Test
    public void registartionTest2() {
        System.out.println("registartionTest2 Method has benn called !!!!");
    }


    @AfterClass
    public void afterClassMethod() {
        tearDown();
    }
}
