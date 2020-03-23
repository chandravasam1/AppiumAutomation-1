package com.automation.appium.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.DriverUtils.*;

public class ContactCreationTest {

    @BeforeClass
    public void beforeClassMethod() throws Exception {
        initDriver();
    }


    @Test
    public void demotest(){
   //     appUtilsForNoti();


    }
   /* @Test(enabled = false)
    public void testadditionOfContact() {
        ContactsScreen contactsScreen = new ContactsScreen();

        contactsScreen.createContact();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        scrollToElementAndClick(contactsScreen.contactName);

        contactsScreen.deleteContact();

    }
*/
    @AfterClass
    public void stopdriver() throws Exception {
        tearDown();
    }
}
