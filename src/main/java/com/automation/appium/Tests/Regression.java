package com.automation.appium.Tests;
        import com.automation.appium.Screen.ContactsScreen;
        import com.automation.appium.Screen.RegistrationScreen;
        import com.automation.appium.Screen.SettingsScreen;
        import com.automation.appium.Utils.CommonUtils;
        import com.automation.appium.Utils.DriverUtils;
        //import com.automation.appium.Utils.excelutils.ExcelUtil;
        import com.automation.appium.listeners.Screenshotpathloc;
        import com.common.excelreport.ExcelReportGenerator;
        import com.github.vsspt.excel.schema.ExcelReport;
        import io.appium.java_client.CommandExecutionHelper;
        import io.appium.java_client.MobileElement;
        import io.appium.java_client.MultiTouchAction;
        import io.appium.java_client.TouchAction;
        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
        import io.appium.java_client.android.nativekey.KeyEvent;
        import io.appium.java_client.remote.AndroidMobileCapabilityType;
        import io.appium.java_client.remote.MobileCapabilityType;
        import io.appium.java_client.screenrecording.CanRecordScreen;
      //  java.lang.String startRecordingScreen();
        import io.appium.java_client.touch.LongPressOptions;
        import io.appium.java_client.touch.WaitOptions;
        import io.appium.java_client.touch.offset.PointOption;
        import org.apache.commons.io.FileUtils;
        import org.apache.poi.ss.formula.functions.T;
        //import org.automationtesting.excelreport.Xl;
        import org.openqa.selenium.*;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.testng.annotations.*;
        import org.testng.asserts.SoftAssert;

        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;
        import java.net.URL;
        import java.time.Duration;
        import java.util.HashMap;


       import org.automationtesting.excelreport.Xl;
        import static com.automation.appium.Utils.DriverUtils.*;
        import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;
        import static com.automation.appium.Utils.PropertyUtils.loadProperties;
//import org.automationtesting.excelreport.Xl;
//@Listeners(com.automation.appium.listeners.Screenshots.class)
    public class Regression extends DriverUtils {
    ContactsScreen contactsScreen = new ContactsScreen();
    SettingsScreen setScreen = new SettingsScreen();
    RegistrationScreen RgScreen = new RegistrationScreen();
    Screenshotpathloc ss = new Screenshotpathloc();
    CommonUtils cus = new CommonUtils();
    //Object of Class SoftAssert is created to use its methods
    SoftAssert softassert = new SoftAssert();
    SoftAssert softassert2 = new SoftAssert();
    private Object AndroidKeyCode;


  /*  @BeforeClass
    public void beforeClassMethod() throws Exception {
        initDriver();
    }*/

   /* @BeforeTest
    public void setupTestData() throws IOException {
        System.out.println("Setup testdata");
        killExistingAppiumProcess ();
        //ExcelUtil.setExcelFileSheet("Logindata");
    }*/

    @Test(priority = 1)
    public void newContactCreation() throws Exception {
        contactsScreen.addNewContact();
      //  Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet.xlsx");
    }

    @Test(priority = 2)
    public void Status() throws Exception {
        contactsScreen.Status();
    }

    @Test(priority = 3)
    public void voiceCall() throws Exception {
        Thread.sleep(3000);
        contactsScreen.voice_Call();
    }

    @Test(priority = 4)
    public void Makingvideocall() throws Exception {
        Thread.sleep(3000);
        contactsScreen.Videocall();
    }
    @Test(priority = 5)
    public void blockUnblock() throws Exception {
        Thread.sleep(2000);
        contactsScreen.blockAndUnblock();
    }

    @Test(priority = 6)
    public void muteAndUnmuteNotifications() throws Exception {
        Thread.sleep(2000);
        contactsScreen.muteAndUnmuteNotifications();
    }

    @Test(priority = 7)
    public void addshortCut() throws Exception {
        Thread.sleep(2000);
    //    cus.rotateDeviceToLandscapeMode();
        contactsScreen.shotcut();
    }

    @Test(priority = 8)
    public void addImage() throws InterruptedException {
        Thread.sleep(5000);
        setScreen.changeAvator();

    }
//9
    @Test(priority = 9)
    public void SendLocationandotherthings() throws Exception {
        Thread.sleep(2000);
        contactsScreen.SendLocationandotherthings();
    }
//10
    @Test(priority = 10)
    public void createNewGroup() throws Exception {
    /*    Thread.sleep(2000);
        setScreen.newGroup();
        Thread.sleep(2000);
        setScreen.addContactToGroup();
        Thread.sleep(2000);
        setScreen.deleteContactFromGroup();
        Thread.sleep(2000);
        setScreen.clickOnGroup();*/
        Thread.sleep(2000);
        RgScreen.fillRegistrationInfo();

    }

    @Test(priority = 14)
    public void Switchapp() throws InterruptedException {
        Runtime runtime1 = Runtime.getRuntime();
        try {
            //4723
            runtime1.exec("cmd.exe /c start cmd.exe /k \"adb shell input keyevent KEYCODE_APP_SWITCH\"");
            // runtime1.exec("cmd.exe /c start cmd.exe /k \"adb shell input keyevent 8");

            Thread.sleep(2000);
        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
        }
        Thread.sleep(2000);
        setScreen.Switchapp();
    }

    @Test(priority = 0)
    public void Twostepverification() throws Exception {
        setScreen.Twostepverification();
    }

    @Test(priority = -2)
    public void callLog_history() throws Exception {
        Thread.sleep(2000);
        contactsScreen.callHistory();
    }

    @Test(priority = -3)
    public void chatlog_history() throws Exception {
        Thread.sleep(2000);
        contactsScreen.chatHistory();
      //   Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet.xlsx");
   //     ExcelReportGenerator.generateExcelReport("New_Microsoft_Excel_Worksheet.xlsx","E:\\Results");
    }

    @AfterClass
    public void stopdriver() throws Exception {
        //Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet.xlsx1");

      //  ExcelReportGenerator.generateExcelReport("New_Microsoft_Excel_Worksheet.xlsx","E:\\Results");
        tearDown();
        service.stop();
   //stopServer();
    }
}