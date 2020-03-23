
package com.automation.appium.Tests;
import com.automation.appium.Screen.ContactsScreen;
import io.qameta.allure.*;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.automationtesting.excelreport.Xl;
import java.io.File;

import static com.automation.appium.Utils.DriverUtils.*;

@Listeners({ TestListenerAdapter.class})
@Epic("Regression")
@Feature("whats app adding contact and making voice call")
public class Tempfile {
   /* String path  = "E:\\RecordandAuthentication.Bat";
    File file = new File(path);*/
    ContactsScreen contactsScreen = new ContactsScreen();
    @Test (priority = 0, description="Adding new contact in whats app")
    @Severity(SeverityLevel.BLOCKER)
    @Description("new contact")
    @Story("jira story exmple-----")
    public void newContactCreation()throws Exception {
        contactsScreen.addNewContact();
        Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet.xlsx1");
        Thread.sleep(2000);
     //   contactsScreen.deleteContact();
     // contactsScreen.sendMessage();
    }
    @Test (priority = 0, description="Making voice call")
    @Severity(SeverityLevel.BLOCKER)
    @Description("new contact")
    @Story("jira story exmple-----")
    public void voiceCall()throws Exception {
        contactsScreen.voice_Call();
        Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet.xlsx");
    }
    @AfterClass
    public void stopdriver1() throws Exception {
        //tearDown();
    // Xl.generateReport("Report_excel.xlsx");
        Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet2.xlsx");
}
}