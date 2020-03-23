package com.automation.appium.Tests;
import com.automation.appium.Screen.ContactsScreen;
import com.automation.appium.Screen.SettingsScreen;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import ru.yandex.qatools.allure.annotations.Attachment;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

import static com.automation.appium.Utils.ApplicationUtils.appUtilsForNoti;
import static com.automation.appium.Utils.DriverUtils.*;
import static com.automation.appium.Utils.ScrollUtils.scrollToElementAndClick;

public class SendingLocation {
    private static String ScreenShot;
    private static Object Ad;


    public static void ScreenShot(String ScreenType) throws Exception {
      /*  ScreenShot = System.getProperty("user.dir") + "/Screen";
        if (ScreenType.equals("Passed")) {

            File Screenshot = ((TakesScreenshot) Ad).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot, new File(ScreenShot + "/" + "/ScreenShot_" + ScreenType + ".png"));
        } else {
            File Screenshot = ((TakesScreenshot) Ad).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot, new File(ScreenShot + "/" + "/ScreenShot_" + ScreenType + ".png"));
            FileUtils.copyFile(Screenshot, new File(ScreenShot + "/Failed/ScreenShot_" + ScreenType + ".png"));*/
     /* Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_PICK);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"),SELECT_PHOTO);*/

        }
    }



/*
package com.automation.appium.Tests;

import com.automation.appium.Screen.ContactsScreen;
import com.automation.appium.Screen.SettingsScreen;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.ApplicationUtils.appUtilsForNoti;
import static com.automation.appium.Utils.DriverUtils.*;
import static com.automation.appium.Utils.ScrollUtils.scrollToElementAndClick;

public class SendingLocation {

    ContactsScreen contactsScreen = new ContactsScreen();
    @BeforeClass
    public void beforeClassMethod() throws Exception {
      //  initDriver();
    }
    @Test(priority = 0)
    public void sendingLocation() throws InterruptedException {
        contactsScreen.SendLocation();

    }
    @Test(priority = 1)
    public void sendVoiceMessage() throws Exception{
        contactsScreen.sendAudio();
    }
    @Test(priority = 2)
    public void notifications_mute() throws Exception{
        contactsScreen.muteAndUnmuteNotifications();
    }
    @Test(priority = 3)
    public void blockUnblock() throws Exception{
        contactsScreen.blockAndUnblock();
    }
    @Test(priority = 4)
    public void addshortCut() throws Exception{
        contactsScreen.shotcut();
    }

    @AfterClass
    public void stopdriver() throws Exception {
        tearDown();
    }
}*/
