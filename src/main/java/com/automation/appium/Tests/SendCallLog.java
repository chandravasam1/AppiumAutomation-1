package com.automation.appium.Tests;

import com.automation.appium.Screen.ContactsScreen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.DriverUtils.initDriver;
import static com.automation.appium.Utils.DriverUtils.tearDown;

public class SendCallLog {
    ContactsScreen contactsScreen = new ContactsScreen();

    @BeforeClass
    public void beforeClassMethod() throws Exception {
     //initDriver(5554);
    }
    @Test(priority = 0)
    public void callLog_history()throws Exception {
        contactsScreen.callHistory();
    }
    @Test(priority = 1)
    public void chatLog_history()throws Exception {
        contactsScreen.chatHistory();
    }

    @AfterClass
    public void stopdriver() throws Exception {
        tearDown();
    }
}
