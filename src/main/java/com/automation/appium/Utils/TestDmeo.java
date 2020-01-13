package com.automation.appium.Utils;

import org.testng.annotations.Test;

public class TestDmeo {


    public void method1() {
        System.out.println("caps.setCapability(\"autoGrantPermissions\", true);");
    }

    public static void method2() {
        System.out.println("Test2");
    }


    public static void main(String[] args) {
        TestDmeo testDmeo = new TestDmeo();
        testDmeo.method1();
        method2();
    }
}
