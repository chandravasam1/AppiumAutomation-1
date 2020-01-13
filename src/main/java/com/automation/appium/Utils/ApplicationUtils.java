package com.automation.appium.Utils;

import io.appium.java_client.android.Activity;

import java.time.Duration;

import static com.automation.appium.Utils.DriverUtils.getDriver;

public class ApplicationUtils {

    public static void backGroundApplication() {
     getDriver().runAppInBackground(Duration.ofSeconds(10));
    }

    public static void forGroundMethod() {
    getDriver().currentActivity();
    }

    public static void switchApplication(String  appPackage, String appActivity){
        Activity activity = new Activity(appPackage, appActivity);
        getDriver().startActivity(activity);

    }

    public static  void appUtilsForNoti() {
        getDriver().lockDevice(Duration.ofSeconds(2));
        getDriver().unlockDevice();
        getDriver().openNotifications();
    }
}
