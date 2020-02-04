package com.automation.appium.Tests;

import com.automation.appium.Screen.ContactsScreen;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.automation.appium.Utils.ApplicationUtils.appUtilsForNotification;
import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.DriverUtils.initDriver;
import static com.automation.appium.Utils.ScrollUtils.scrollToElementAndClick;

public class ContactCreationTest {
    @BeforeClass
    public void beforeClassMethod() {
        initDriver();
    }


   // @Test
    public void demotest() {
        appUtilsForNotification();
        getDriver().pressKey(new KeyEvent(AndroidKey.BACK));


    }

    @Test
    public void testadditionOfContact() {
        ContactsScreen contactsScreen = new ContactsScreen();
        contactsScreen.createContact();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        scrollToElementAndClick(contactsScreen.contactName);
        contactsScreen.deleteContact();


    }
}
