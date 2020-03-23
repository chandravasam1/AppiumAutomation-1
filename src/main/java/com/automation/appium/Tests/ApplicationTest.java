package com.automation.appium.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.ApplicationUtils.*;
import static com.automation.appium.Utils.DriverUtils.initDriver;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;

public class ApplicationTest {


    @BeforeClass
    public void beforeClassMethod() throws  Exception{
        initDriver();
    }
  @Test
    public void test1() {
        backGroundApplication();
        forGroundMethod();
        switchApplication(getPropertyByKey("app.packagesetting"), getPropertyByKey("app.activitysetting"));
    }
}
