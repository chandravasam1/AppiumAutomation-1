package com.automation.appium.Screen;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.Dimension;
import com.automation.appium.Utils.DriverUtils;
import io.appium.java_client.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.Widget;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import static com.automation.appium.Utils.DriverUtils.driver;
import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;
import static io.appium.java_client.touch.offset.PointOption.point;

public class SettingsScreen   {

    public SettingsScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
    @AndroidFindBy(accessibility = "More options")
    public AndroidElement More_options;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    //android.widget.ImageView[@content-desc="More options"]
    public AndroidElement moreOptions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout")
    public AndroidElement settings;

    @AndroidFindBy(accessibility = "You")
    public AndroidElement avator;

    @AndroidFindBy(accessibility = "Profile photo")
    public AndroidElement profilePhoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView")
    public AndroidElement gallery;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")
    public AndroidElement cameraPhoto;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Photo\"])[1]")
    public AndroidElement selectPhoto;

    @AndroidFindBy(id = "com.whatsapp:id/ok_btn")
    public AndroidElement done;

    @AndroidFindBy(accessibility = "Edit")
    public AndroidElement editPhoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView")
    public AndroidElement removePhoto;

    @AndroidFindBy(accessibility = "Remove")
    public AndroidElement remove;

 /*   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]")
    public AndroidElement editName;*/

    @AndroidFindBy(id = "com.whatsapp:id/profile_settings_row_secondary_icon")
    public AndroidElement editName;

    @AndroidFindBy(id = "com.whatsapp:id/edit_text")
    public AndroidElement enterName;

    @AndroidFindBy(id = "com.whatsapp:id/save_button")
    public AndroidElement saveName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    public AndroidElement newgroup;

    @AndroidFindBy(accessibility = "Next")
    public AndroidElement next;

    @AndroidFindBy(accessibility = "Done")
    public AndroidElement doneAdd;

    @AndroidFindBy(id = "com.whatsapp:id/group_name")
    public AndroidElement groupname;

    @AndroidFindBy(accessibility = "Create")
    public AndroidElement createGroup;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    public AndroidElement groupInfo;

    @AndroidFindBy(accessibility = "Add participants")
    public AndroidElement addParticipants;

    @AndroidFindBy(accessibility = "Search")
    public AndroidElement serchContactByname;

    /*@AndroidFindBy(accessibility = "Search participants")
    public AndroidElement serchContactToRemoveFromGroup;*/

    @AndroidFindBy (id = "com.whatsapp:id/search_src_text")
    private AndroidElement search_src_text;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout")
    private AndroidElement requiredName;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout")
    private AndroidElement requiredName2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Search participants\"]")
    public AndroidElement searchParticipants;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView\n")
    public AndroidElement removeParticipants;

    @AndroidFindBy(id = "android:id/button1")
    public AndroidElement removeOk;

    @AndroidFindBy(xpath = "/android.widget.LinearLayout[@content-desc=\"Navigate up\"]/android.widget.ImageView")
    public AndroidElement searchBack;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]")
    public AndroidElement group1;

    @AndroidFindBy(accessibility = "Navigate up")
    public AndroidElement backToHome;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView")
    public AndroidElement topBar_call;


    @AndroidFindBy(accessibility = "com.whatsapp:id/emoji_picker_btn")
    public AndroidElement Emojies;

    @AndroidFindBy(accessibility = "com.whatsapp:id/input_attach_button")
    public AndroidElement Attachment;

    @AndroidFindBy(accessibility = "com.whatsapp:id/pickfiletype_gallery")
    public AndroidElement Pics;

    @AndroidFindBy(accessibility = "com.whatsapp:id/thumbnail")
    public AndroidElement Thumbnail1;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Group icon\"]")
    public AndroidElement Groupphoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
    public AndroidElement Group_Camera;

    @AndroidFindBy(id = "com.oppo.camera:id/shutter_button")
    public AndroidElement Group_Shuttercameraclick;

    @AndroidFindBy(id = "com.oppo.camera:id/done_button")
    public AndroidElement Group_Camerabutton;

    @AndroidFindBy(id = "com.whatsapp:id/ok_btn")
    public AndroidElement Group_camerashutter;

    @AndroidFindBy(id = "com.whatsapp:id/entry")
    public AndroidElement send_mgs;

   /* @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    public AndroidElement G_send_mgs;
    */
    @AndroidFindBy(id = "com.whatsapp:id/entry")
    public AndroidElement G_send_mgs;

    @AndroidFindBy(id = "com.whatsapp:id/buttons")
    public AndroidElement Group_sendmessage;

    @AndroidFindBy(id = "com.whatsapp:id/exit_group_btn")
    public AndroidElement Group_Exitgroup;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Exit\"]")
    public AndroidElement Group_Exitgroup_ok;

    @AndroidFindBy(id = "com.whatsapp:id/exit_group_btn")
    public AndroidElement Group_Delete;

    @AndroidFindBy(id = "android:id/button1")
    public AndroidElement Group_Delete_ok;

    @AndroidFindBy(id = "com.whatsapp:id/settings_account_info")
    public AndroidElement Account;

    @AndroidFindBy(id = "com.whatsapp:id/delete_account_preference")
    public AndroidElement Delete;

    @AndroidFindBy(id = "com.whatsapp:id/registration_phone")
    public AndroidElement Delete_number;

    @AndroidFindBy(id = "com.whatsapp:id/delete_account_submit")
    public AndroidElement Delete_my_account;

    @AndroidFindBy(id = "com.whatsapp:id/two_step_verification_preference")
    public AndroidElement Two_step_verification;

    @AndroidFindBy(id = "com.whatsapp:id/enable_button")
    public AndroidElement Two_step_verification_Enable;

    @AndroidFindBy(id = "com.whatsapp:id/code")
    public AndroidElement Two_step_verification_code;

    @AndroidFindBy(id = "com.whatsapp:id/submit")
    public AndroidElement Two_step_verification_next;

    @AndroidFindBy(id = "com.whatsapp:id/code")
    public AndroidElement Two_step_verification_code2;

    @AndroidFindBy(id = "com.whatsapp:id/submit")
    public AndroidElement Two_step_verification_next2;

    @AndroidFindBy(id = "com.whatsapp:id/email")
    public AndroidElement Two_step_verification_email;

    @AndroidFindBy(id = "com.whatsapp:id/submit")
    public AndroidElement Two_step_verification_next3;

    @AndroidFindBy(id = "com.whatsapp:id/email")
    public AndroidElement Two_step_verification_email2;

    @AndroidFindBy(id = "com.whatsapp:id/submit")
    public AndroidElement Two_step_verification_save;

    @AndroidFindBy(id = "com.whatsapp:id/done_button")
    public AndroidElement Two_step_verification_done;


   // 3navigations

  //  @AndroidFindBy(id = "com.whatsapp:id/code")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\n")
    public AndroidElement Two_step_verification_Enter;

   // Disable--more--setti--account--twosteop--disab

    @AndroidFindBy(id = "com.whatsapp:id/disable_button")
    public AndroidElement Two_step_verification_disable;

    @AndroidFindBy(id = "android:id/button1")
    public AndroidElement Two_step_verification_disable2;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"More\"]")
    public AndroidElement Switchapp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout")
    public AndroidElement Headerclick;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]")
    public AndroidElement Splitscreen;

    public void Switchapp() throws InterruptedException {
       Thread.sleep(3000);
        Switchapp.click();
        Thread.sleep(3000);
        Splitscreen.click();
        Thread.sleep(2000);
        Activity activity = new Activity("com.google.android.calendar","com.android.calendar.LaunchActivity");
        activity.setStopApp(false);
        driver.startActivity(activity);
        Thread.sleep(2000);
     //   int x = 534,y=1173;
    //    (new TouchAction(driver)).tap(534 ,1173);
      //  new TouchAction(driver).press(point(534, 1173)).perform();
       // Headerclick.click();
    }


    public void Thumbnail1() throws InterruptedException {
       // Thread.sleep(3000);
        //Thumbnail.click();
        Thread.sleep(4000);
        AndroidTouchAction touch = new AndroidTouchAction(driver);
        touch.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(Thumbnail1)));
        touch.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)));
    }

    public void Pics() throws InterruptedException {
        Thread.sleep(3000);
        Pics.click();
    }

    public void Attachment() throws InterruptedException {
        Thread.sleep(3000);
        Attachment.click();
    }


    public void Status() throws InterruptedException {
     Thread.sleep(3000);
    // driver.pressKey(KeyEvent(187))
    //    driver.pressKeyCode(66);
       // ((AndroidDriver)driver).pressKeyCode(66);
      //  ((DriverUtils) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
     //   ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.HOME));
       // ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_MENU);
       // getdriver.driver.press_keycode 187
      //  driver.pressKeyCode(67);

        Emojies.click();
    }



    public void changeAvator() throws InterruptedException {
      try {

        More_options.click();
        settings.click();
     /*   String Actual = settings.getText();
        Assert.assertEquals(Actual,"settings");*/
        avator.click();
        profilePhoto.click();
        Thread.sleep(2000);
        gallery.click();
        cameraPhoto.click();
        selectPhoto.click();
        done.click();


        System.out.println("Profile pic updated succcessfully");
    }
      catch(Exception e){
          System.out.println("Profile pic not updated succcessfully");
          Assert.fail("Profile pic not updated succcessfully");
        }
Thread.sleep(3000);
        profilePhoto.click();
        editPhoto.click();
        removePhoto.click();
        remove.click();
Thread.sleep(3000);
        editName.click();
        enterName.clear();
        enterName.sendKeys("Test1");
        saveName.click();

        //Added
        getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }


    public void newGroup() throws InterruptedException {
      /* getDriver().navigate().back();
        getDriver().navigate().back();*/
        Thread.sleep(2000);
        More_options.click();
        newgroup.click();
        List<WebElement> Contact = getDriver().findElements(By.className("android.widget.RelativeLayout"));
        try{
            for (int i=0; i <=2; i ++) {
                Contact.get(i).click();
            }
        }catch (Exception e){

        }
        next.click();
        Thread.sleep(2000);
        groupname.clear();
        Thread.sleep(2000);
        groupname.sendKeys("App Team");
        Thread.sleep(2000);
        Groupphoto.click();
        Thread.sleep(2000);
        Group_Camera.click();
        Thread.sleep(2000);
        Group_Shuttercameraclick.click();
        Thread.sleep(2000);
        Group_Camerabutton.click();
        Thread.sleep(2000);
        Group_camerashutter.click();
        Thread.sleep(2000);
        createGroup.click();
        Thread.sleep(3000);
        G_send_mgs.sendKeys(getPropertyByKey("Sendmessage"));
        Thread.sleep(2000);
        Group_sendmessage.click();
        Thread.sleep(2000);
    }
    public void addContactToGroup() throws InterruptedException {

        moreOptions.click();
        Thread.sleep(2000);
        groupInfo.click();
        Thread.sleep(2000);
        addParticipants.click();
        Thread.sleep(2000);
        serchContactByname.click();
        //ask
        search_src_text.sendKeys(getPropertyByKey("serchContactName1"));
        //search_src_text.sendKeys(get);
        requiredName.click();
        Thread.sleep(2000);
        doneAdd.click();
        Thread.sleep(2000);

      // timebeing comment this
        /*Thread.sleep(3000);
      getDriver().navigate().back();
        Thread.sleep(2000);
       getDriver().navigate().back();*/
    }
    public void clickOnGroup(){

        group1.click();
    }

    public void callHistory() throws Exception{
        topBar_call.click();
        List<WebElement> Contact = getDriver().findElements(By.className("android.widget.RelativeLayout"));
        System.out.println(Contact.size()+"--------");
        //   WebElement ele=getDriver().findElement(By.xpath("android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView"));
        try{
            for (int i=0; i <=2; i ++){
                List<WebElement> Contact2 = Contact.get(i).findElements(By.className("android.widget.TextView"));
                System.out.println("j size--"+Contact2.size());
                try{
                    for(int j=0; j <=Contact2.size(); j++){

                        System.out.println(i+" "+"--------------"+Contact2.get(j).getText());
                    }
                }
                catch (Exception e){

                }

            }
        }catch (Exception e){

        }

    }
    public void deleteContactFromGroup() {
        try {
            /*moreOptions.click();
            Thread.sleep(1000);
            groupInfo.click();*/
            Thread.sleep(2000);
            getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add participants\"));"));
            Thread.sleep(2000);
            searchParticipants.click();
            Thread.sleep(2000);
            // commented this along with elemenyts serchContactToRemoveFromGroup.click();
            search_src_text.sendKeys(getPropertyByKey("serchContactName1"));
            Thread.sleep(2000);
            requiredName2.click();
            Thread.sleep(2000);
            removeParticipants.click();
            Thread.sleep(2000);
            removeOk.click();
            Thread.sleep(2000);
            getDriver().navigate().back();
            Thread.sleep(2000);
            getDriver().navigate().back();
            Thread.sleep(2000);
            getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Exit group\"));"));
            Thread.sleep(2000);
            Group_Exitgroup.click();
            Thread.sleep(2000);
            Group_Exitgroup_ok.click();
            Thread.sleep(2000);
            Group_Delete.click();
            Thread.sleep(2000);
            Group_Delete_ok.click();
            Thread.sleep(2000);
            //searchBack.click();
            // backToHome.click();
            // getDriver().navigate().back();
            More_options.click();
            Thread.sleep(2000);
            settings.click();
            Thread.sleep(2000);
            Account.click();
            Thread.sleep(2000);
            Delete.click();
            Thread.sleep(2000);
            Delete_number.sendKeys(getPropertyByKey("DeleteNumber"));
            Thread.sleep(3000);
            // getDriver().navigate().back();
            // Thread.sleep(3000);
            Delete_my_account.click();
            Thread.sleep(3000);
            Delete_my_account.click();
            Thread.sleep(3000);
            Delete_my_account.click();


        } catch (Exception e) {

        }

    }
        public void Twostepverification() throws InterruptedException {
            More_options.click();
            settings.click();
            Account.click();
            Two_step_verification.click();
            Two_step_verification_Enable.click();
            Two_step_verification_code.sendKeys(getPropertyByKey("Twostepcode"));
           // Two_step_verification_next.click();
            Two_step_verification_code2.sendKeys(getPropertyByKey("Twostepcode"));
           // Two_step_verification_next2.click();
            Two_step_verification_email.sendKeys(getPropertyByKey("Twostep_Email"));
            Two_step_verification_next3.click();
            Two_step_verification_email2.sendKeys(getPropertyByKey("Twostep_Email"));

            Two_step_verification_save.click();
            Thread.sleep(5000);
            Two_step_verification_done.click();
            getDriver().navigate().back();
            getDriver().navigate().back();
            getDriver().navigate().back();
            //Write condition if popup exists then ask for authenticaion
           Two_step_verification_Enter.sendKeys(getPropertyByKey("Twostepcode"));
            More_options.click();
            settings.click();
            Account.click();
            Two_step_verification.click();
            Two_step_verification_disable.click();
            Two_step_verification_disable2.click();
            Thread.sleep(3000);
         // String st =  driver.getClipboardText();
        //  System.out.println(st);
            getDriver().navigate().back();
            Thread.sleep(1000);
            getDriver().navigate().back();
            Thread.sleep(1000);
            getDriver().navigate().back();



    }
    //ASK
    public void scrollDown(AppiumDriver<? extends MobileElement> driver) {
        Dimension size = driver.manage().window().getSize();
        TouchAction action = new TouchAction(driver);
        action.tap(new PointOption().withCoordinates(1080, 1906)).perform();
    }
}
