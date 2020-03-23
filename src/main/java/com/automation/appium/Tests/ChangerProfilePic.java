/*
package com.automation.appium.Tests;

import com.automation.appium.Screen.ContactsScreen;
import com.automation.appium.Screen.SettingsScreen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.DriverUtils.initDriver;
import static com.automation.appium.Utils.DriverUtils.tearDown;

public class ChangerProfilePic {
    SettingsScreen setScreen = new SettingsScreen();

    @BeforeClass
    public void beforeClassMethod() throws Exception {
     //   initDriver();
    }
    @Test(priority = 0)
    public void addImage(){
        setScreen.changeAvator();
    }
    @Test(priority = 1)
    public void updateProfileName(){
        setScreen.renameProfile();
    }

    @Test(priority = 2)
    public void deletePhoto(){
        setScreen.removeProfilePhoto();
    }
    @Test(priority = 3)
    public void createNewGroup() throws InterruptedException {
        setScreen.newGroup();
        setScreen.addContactToGroup();
    }
  */
/*  @Test(priority = 4)
    public void addParticipants(){
        setScreen.addContactToGroup();
    }*//*

    @Test(priority = 5)
    public void deleteParticipants(){
        setScreen.deleteContactFromGroup();
    }

    @AfterClass
    public void stopdriver() throws Exception {
        tearDown();
    }
}
*/
