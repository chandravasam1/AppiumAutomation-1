package com.automation.appium.Screen;
import com.automation.appium.Utils.CommonUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.sound.sampled.AudioInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import static com.automation.appium.Utils.DriverUtils.driver;
import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;

public class ContactsScreen {
    CommonUtils cu = new CommonUtils();

    public ContactsScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Ctester test")
    public AndroidElement contactName;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout\n")
    public AndroidElement topBar_call;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.TextView\n")
    public AndroidElement topBar_Status;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout")
    public AndroidElement topBar_chat;

    public AndroidFindBy menu_list;

    @AndroidFindBy(id = "floating_action_button")
    public AndroidElement addContactBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]")
    public AndroidElement firstNamefield;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]")
    public AndroidElement lastNamefield;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    public AndroidElement phoneField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    public AndroidElement emailField;

    @AndroidFindBy(id = "com.android.contacts:id/editor_menu_save_button")
    public AndroidElement saveBtn;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='More options']")
    public AndroidElement optionIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    public AndroidElement deleteOption;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    public AndroidElement deleteBtn;

    @AndroidFindBy(accessibility = "Search")
    public AndroidElement serchContactByname;

    @AndroidFindBy(id = "com.whatsapp:id/search_src_text")
    public AndroidElement search_src_text;

    @AndroidFindBy(id = "com.whatsapp:id/contact_row_container")
    public AndroidElement requiredName;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Attach\"]")
    public AndroidElement attach_ele;

    /*@AndroidFindBy(accessibility = "Voice note recorder")
    public AndroidElement voice_element;*/

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Voice note recorder\"]")
    public AndroidElement voice_element;


    @AndroidFindBy(accessibility = "Slide to cancel")
    public AndroidElement slide_Tocancel;

  //  30500

//......Doc.............
    @AndroidFindBy(id = "com.whatsapp:id/pickfiletype_document_holder")
    public AndroidElement document;

    @AndroidFindBy (xpath="//android.widget.TextView[@content-desc=\"Search\"]")
    public AndroidElement R_search;

    @AndroidFindBy(id = "com.whatsapp:id/search_src_text")
    public AndroidElement R_search_src_text;

    @AndroidFindBy(id = "com.whatsapp:id/document_picker_item")
    public AndroidElement Textdoc;

    @AndroidFindBy(id = "android:id/button1")
    public AndroidElement Send_Textdoc;
    //Again click on attachment and select next




//.........ContactsScreen....//
    @AndroidFindBy(id = "com.whatsapp:id/pickfiletype_contact")
    public AndroidElement Contact1;

    @AndroidFindBy (xpath="//android.widget.TextView[@content-desc=\"Search\"]")
    public AndroidElement R1_search;

    @AndroidFindBy(id = "com.whatsapp:id/search_src_text")
    public AndroidElement R1_search_src_text;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    public AndroidElement Select_name;

    @AndroidFindBy(id = "com.whatsapp:id/next_btn")
    public AndroidElement Clickonnext;

    @AndroidFindBy(id = "com.whatsapp:id/send_btn")
    public AndroidElement Sendnow;
 //

 //now again click on attchment


//........AudioInputStream..........
    @AndroidFindBy(id = "com.whatsapp:id/pickfiletype_audio_holder")
    public AndroidElement Audio;

   @AndroidFindBy(id = "com.whatsapp:id/audio_file_details")
    public AndroidElement Select_Audio;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Send\"]")
    public AndroidElement Select_send_Audio;

   @AndroidFindBy(id = "android:id/button1")
    public AndroidElement ClickonSelected_Audio;



    @AndroidFindBy(id = "com.whatsapp:id/pickfiletype_gallery_holder")
    public AndroidElement Gallary;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")
    public AndroidElement Click_on_Screenshots;


   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView")
    public AndroidElement Gallary_ok;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Send\"]")
    public AndroidElement Gallary_Send;


   @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Photo\"])[1]")
//   (//android.widget.ImageView[@content-desc="Photo"])[5]
    public AndroidElement Click_on_SS;


    @AndroidFindBy(id = "com.whatsapp:id/pickfiletype_location")
    public AndroidElement desiredLocation;

    @AndroidFindBy(id = "com.whatsapp:id/send_current_location_icon")
    public AndroidElement currentLocation;

/*/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/
    android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/
    android.widget.FrameLayout[2]/android.widget.FrameLayout[3]/android.widget.LinearLayout/
    android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/
    android.widget.FrameLayout[2]/android.widget.LinearLayout*/

/* @AndroidFindBy (id = "com.whatsapp:id/send_current_location_icon")
    public AndroidElement currentLocation;*/

    @AndroidFindBy(id = "com.whatsapp:id/voice_note_btn_slider")
    public AndroidElement voice_note_btn_slider;

    @AndroidFindBy(id = "com.whatsapp:id/submenuarrow")
    public AndroidElement more_opts;
    ///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.ImageView

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    public AndroidElement block_opts;

    @AndroidFindBy(accessibility = "More options")
    public AndroidElement menu_more_options;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout")
    public AndroidElement mute_notifications;

    @AndroidFindBy(accessibility = "OK")
    public AndroidElement mute_ok;

    @AndroidFindBy(accessibility = "Block")
    public AndroidElement block;

  /*  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    public AndroidElement block;*/


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    public AndroidElement addShortcut;

   /* @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
    public AndroidElement addAutomatically;*/


    @AndroidFindBy(id = "com.oppo.launcher:id/btn_agree")
    public AndroidElement addAutomatically;
    //---------------------------CAll------------
    @AndroidFindBy(accessibility = "Call")
    public AndroidElement whatsAppCall;

    @AndroidFindBy(id = "android:id/button1")
    public AndroidElement whatsAppCall1;

    //android.widget.ImageButton[@content-desc="Call"]
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Video call\"]")
    public AndroidElement whatsAppvideoCall;


   // @AndroidFindBy(xpath = "@AndroidFindBy(accessibility = \"End Voice Call\")")

   // @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"End Voice Call\"]' and @bounds='[453,1737][627,1911]'")
    @AndroidFindBy(id = "com.whatsapp:id/end_call_btn")
    public AndroidElement whatsAppCall_end;

    /*@AndroidFindBy(accessibility = "Video call")
    public AndroidElement whatsAppvideoCall_end;*/

     @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"End Video Call\"]")
    public AndroidElement whatsAppvideoCall_end;


    /*@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"End Video Call\"]")
    public AndroidElement whatsAppvideoCall_end;*/

    //-----------New contact--------------
    @AndroidFindBy(accessibility = "New chat")
    public AndroidElement new_chat;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout")
    public AndroidElement new_contact_btn;

  /*  @AndroidFindBy(className = "android.widget.EditText")
    public AndroidElement first_name;*/

    //   @AndroidFindBy(xpath = "//android.widget.EditText[contains(text(), 'Name')]")
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[180,586][900,742]' and @text='Name']")
    public AndroidElement first_name1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.widget.ColorDrawerLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    public AndroidElement first_name;

   // @AndroidFindBy(xpath = "//android.widget.EditText[contains(text(), 'Number')]")

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and  @text='Number' and @bounds='[399,1285][1008,1441]']")
    public AndroidElement phone_num;

    // @AndroidFindBy (id = "com.google.android.contacts:id/menu_save")
    @AndroidFindBy(id = "com.android.contacts:id/menu_done")
    public AndroidElement save_btn;

    @AndroidFindBy(id = "android:id/text1")
    public AndroidElement save_contact;


    //--------------------------------
    //   Send message
    @AndroidFindBy(id = "com.whatsapp:id/entry")
    public AndroidElement send_mgs;

    @AndroidFindBy(id = "com.whatsapp:id/emoji_picker_btn")
    public AndroidElement Text_Emoji;



    @AndroidFindBy(id = " com.whatsapp:id/camera_btn")
    public AndroidElement Camera1;
    //Emoji_1
//Sending from contacts  com.android.contacts:id/data
//    //@AndroidFindBy(id = "com.android.contacts:id/pre_primary_action_view")

   // @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[114,1359][696,1424]' and @text='Message +91 91540 2480']")
   // public AndroidElement send_mgs_Contact;
   // @AndroidFindBy(id = "(com.android.contacts:id/actions_view_container)[1]")
 /*  @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout")
   public AndroidElement send_mgs_Contact;
*/
  @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout")
  public AndroidElement send_mgs_Contact;

    //com.android.contacts:id/actions_view_container

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Send\"]")
    public AndroidElement send_btn;



    //Updatestatus

    @AndroidFindBy(id = "New status update")
    public AndroidElement Updatestatus;

    @AndroidFindBy(id = "com.whatsapp:id/shutter")
    public AndroidElement Shutter;

/*    @AndroidFindBy(id = "com.whatsapp:id/caption")
    public AndroidElement caption;*/

//android.widget.ImageView[@content-desc="Double tap and hold for video, double tap for photo"]

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Double tap and hold for video, double tap for photo\"]")
    public AndroidElement S_Doubletap;


    @AndroidFindBy(id = "com.whatsapp:id/fab")
    public AndroidElement S_cameraclick;

    @AndroidFindBy(id = "com.whatsapp:id/shutter")
    public AndroidElement Shuttercameraclick;

    @AndroidFindBy(id = "com.whatsapp:id/camera_btn")
    public AndroidElement Camerabutton;

    @AndroidFindBy(xpath = " //android.widget.ImageButton[@content-desc=\"Send\"]")
    public AndroidElement camerashutter;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Switch camera\"]")
    public AndroidElement S_Cameraswitch;

    @AndroidFindBy(id = "com.whatsapp:id/submit")
    public AndroidElement Location_Continue;

    @AndroidFindBy (id = "com.android.permissioncontroller:id/permission_allow_button")
    public AndroidElement Allow_permission;

    @AndroidFindBy(id = "com.whatsapp:id/button_open_permission_settings")
    public AndroidElement Location_Settings;

    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]")
    public AndroidElement Location_Permission;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]")
    public AndroidElement Location_select;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/foreground_only_radio_button")
    public AndroidElement Location_Allow;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    public AndroidElement Loc_Edit;

    @AndroidFindBy(className = "android.widget.EditText")
    public AndroidElement Loc_editbox;

    @AndroidFindBy(accessibility = "com.whatsapp:id/emoji_picker_btn")
    public AndroidElement Emojies;

    @AndroidFindBy(id = "com.whatsapp:id/message_text")
    public AndroidElement Share;

    @AndroidFindBy(xpath = " //android.widget.TextView[@content-desc=\"Forward\"]")
    public AndroidElement Forward;

    @AndroidFindBy(xpath = " /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout\n")
    public AndroidElement Forward_person;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Send\"]")
    public AndroidElement Forward_send;


    public void SendLocationandotherthings() throws InterruptedException {

        serchContactByname.click();
        search_src_text.sendKeys(getPropertyByKey("serchContactName2"));
        requiredName.click();
        Thread.sleep(3000);
        Loc_editbox.sendKeys("OppoMobiles");
        Thread.sleep(2000);
        // attach_ele.click();


        Loc_editbox.sendKeys("OppoMobiles");
        Thread.sleep(2000);
        AndroidTouchAction touch2 = new AndroidTouchAction(driver);
        touch2.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(attach_ele)));
        touch2.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)));
        touch2.release().perform();
        //   Thread.sleep(3000);///
        desiredLocation.click();
        cu.screencapture("Attach_location");
        Thread.sleep(3000);
        currentLocation.click();
        cu.screencapture("Attach_Location2");
        Thread.sleep(2000);

//.......Document send......//
    AndroidTouchAction touch3 = new AndroidTouchAction(driver);
    touch3.longPress(LongPressOptions.longPressOptions()
              .withElement(ElementOption.element(attach_ele)));
       touch3.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
        touch3.release().perform();

        Thread.sleep(2000);
        document.click();
        cu.screencapture("Attach_Doc");
        Thread.sleep(2000);
        R_search.click();
        Thread.sleep(2000);
        R_search_src_text.sendKeys(getPropertyByKey("Documentname"));
        Thread.sleep(2000);
        ;
        Textdoc.click();
        Thread.sleep(2000);
        Send_Textdoc.click();
        cu.screencapture("Attach_Doc1");
        Thread.sleep(3000);
        //...Audio....//

        Loc_editbox.sendKeys("OppoMobiles");
        Thread.sleep(2000);
        //   attach_ele.click();
        AndroidTouchAction touch6 = new AndroidTouchAction(driver);
        touch6.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(attach_ele)));
        touch6.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
        touch6.release().perform();
       // Thread.sleep(2000);
        Audio.click();
        Thread.sleep(2000);
        Select_Audio.click();
        Thread.sleep(2000);
        Select_send_Audio.click();
        cu.screencapture("Attach_Audio");
        Thread.sleep(2000);
        ClickonSelected_Audio.click();
        Thread.sleep(3000);
        cu.screencapture("Attach_Audiosend");
        Loc_editbox.sendKeys("OppoMobiles");
        Thread.sleep(2000);
        //...Contactnumber....//
        // attach_ele.click();
        AndroidTouchAction touch4 = new AndroidTouchAction(driver);
        touch4.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(attach_ele)));
        touch4.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
        touch4.release().perform();

        Contact1.click();
        Thread.sleep(2000);
        R1_search.click();
        Thread.sleep(2000);
        R1_search_src_text.sendKeys(getPropertyByKey("Selectcontactname"));
        Thread.sleep(2000);
        Select_name.click();
        cu.screencapture("Attach_Contact");
        Thread.sleep(2000);
        Clickonnext.click();
        Thread.sleep(2000);
        Sendnow.click();
        cu.screencapture("Attach_Contactsend");
        Thread.sleep(3000);
        //.....Location.//
        //  attach_ele.click();

        /*Loc_editbox.sendKeys("OppoMobiles");
        Thread.sleep(2000);
        AndroidTouchAction touch7 = new AndroidTouchAction(driver);
        touch2.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(attach_ele)));
        touch2.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)));
        touch2.release().perform();
     //   Thread.sleep(3000);///
        desiredLocation.click();
        cu.screencapture("Attach_location");
        Thread.sleep(3000);*/
       /* Location_Continue.click();
        Thread.sleep(2000);
        Allow_permission.click();*/
      // Thread.sleep(2000);
        //or//
       /* Location_Settings.click();
        Thread.sleep(2000);
        Location_Permission.click();
        Thread.sleep(2000);
        Location_select.click();
        Thread.sleep(2000);
        Location_Allow.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().back();*/

        /*currentLocation.click();
        cu.screencapture("Attach_Location2");
        Thread.sleep(2000);*/
        Loc_editbox.sendKeys("OppoMobiles");

        AndroidTouchAction touch1 = new AndroidTouchAction(driver);
        touch1.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(attach_ele)));
        touch1.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
        touch1.release().perform();
        Gallary.click();
        Thread.sleep(3000);
        /*getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(bounds(\"[0,1722][534,2199]\"));"));
        Thread.sleep(3000);*/
        Click_on_Screenshots.click();
        AndroidTouchAction touch5 = new AndroidTouchAction(driver);
        touch5.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(Click_on_SS)));
        touch5.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)));
        touch5.release().perform();
        Thread.sleep(3000);
        List<WebElement> Contact = getDriver().findElements(By.className("android.widget.ImageView"));
        try {
            for (int i = 2; i <= 18; i++) {
                Contact.get(i).click();
                Thread.sleep(1000);

            }
        } catch (Exception e) {

        }
        Thread.sleep(2000);
        cu.screencapture("Attach_Gallary");
        Gallary_ok.click();
        Thread.sleep(20000);
        Gallary_Send.click();
        Thread.sleep(3000);
        //Voice....//

        Loc_editbox.clear();
        Thread.sleep(1000);
        AndroidTouchAction touch = new AndroidTouchAction(driver);
        touch.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(voice_element)));
        touch.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)));
        touch.release().perform();
        Thread.sleep(3000);
      //  cu.screencapture("Attach_Audio");

        getDriver().navigate().back();
        Thread.sleep(2000);
       getDriver().navigate().back();
        Thread.sleep(2000);
        /*getDriver().navigate().back();
        Thread.sleep(2000);*/
    }


    public void callHistory() throws Exception {
        topBar_call.click();
        List<WebElement> Contact = getDriver().findElements(By.className("android.widget.RelativeLayout"));
        System.out.println(Contact.size() + "--------");
        //   WebElement ele=getDriver().findElement(By.xpath("android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView"));
        try {
            for (int i = 0; i <= 2; i++) {
                List<WebElement> Contact2 = Contact.get(i).findElements(By.className("android.widget.TextView"));
                System.out.println("j size--" + Contact2.size());
                try {
                    for (int j = 0; j <= Contact2.size(); j++) {

                        System.out.println(i + " " + "--------------" + Contact2.get(j).getText());
                    }
                } catch (Exception e) {

                }

            }
        } catch (Exception e) {

        }
        getDriver().navigate().back();
        Thread.sleep(2000);

    }

    public void chatHistory() {
        topBar_chat.click();
        List<WebElement> Contact = getDriver().findElements(By.className("android.widget.RelativeLayout"));
        System.out.println(Contact.size() + "--------");
        //   WebElement ele=getDriver().findElement(By.xpath("android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView"));
        try {
            for (int i = 0; i <= 2; i++) {
                List<WebElement> Contact2 = Contact.get(i).findElements(By.className("android.widget.TextView"));
                System.out.println("j size--" + Contact2.size());
                try {
                    for (int j = 0; j <= Contact2.size(); j++) {

                        System.out.println(i + " " + "--------------" + Contact2.get(j).getText());
                    }
                } catch (Exception e) {

                }

            }
        } catch (Exception e) {

        }

    }


    public void deleteContact() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        optionIcon.click();
        deleteOption.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deleteBtn.click();
    }

    public void muteAndUnmuteNotifications() throws InterruptedException {
      /*    serchContactByname.click();
        Thread.sleep(2000);
        search_src_text.sendKeys(getPropertyByKey("serchContactName"));
        Thread.sleep(2000);
        requiredName.click();
*/

        menu_more_options.click();
        Thread.sleep(1000);
        mute_notifications.click();
        cu.screencapture("Mute_mute");
        Thread.sleep(1000);
        mute_ok.click();
        Thread.sleep(2000);
        menu_more_options.click();
        Thread.sleep(1000);
        mute_notifications.click();
        cu.screencapture("Mute_unmute");
    }

    public void blockAndUnblock() throws InterruptedException {
    /*    serchContactByname.click();
        Thread.sleep(2000);
        search_src_text.sendKeys(getPropertyByKey("serchContactName"));
        Thread.sleep(2000);
        requiredName.click();*/
        Thread.sleep(2000);

        menu_more_options.click();
        Thread.sleep(2000);
        more_opts.click();
        Thread.sleep(2000);
        block_opts.click();
        cu.screencapture("Block_block");
        Thread.sleep(1000);
        block.click();
        Thread.sleep(2000);
        menu_more_options.click();
        Thread.sleep(2000);
        more_opts.click();
        Thread.sleep(2000);
        block_opts.click();
        cu.screencapture("Block_unblock");
        Thread.sleep(2000);

        /*getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().back();*/
    }

    public void shotcut() throws InterruptedException {
       /* Thread.sleep(1000);
        serchContactByname.click();
        Thread.sleep(1000);
        search_src_text.sendKeys(getPropertyByKey("serchContactName"));
        Thread.sleep(1000);
        requiredName.click();*/


        Thread.sleep(2000);
        menu_more_options.click();
        cu.screencapture("shortcut_more");
        Thread.sleep(3000);
        more_opts.click();
        cu.screencapture("shortcut_more");
        Thread.sleep(3000);
        addShortcut.click();
        Thread.sleep(3000);
        addAutomatically.click();
        cu.screencapture("shortcut_more");
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
       getDriver().navigate().back();
        Thread.sleep(2000);
    }

    public void addNewContact() throws InterruptedException {
        new_chat.click();
        cu.screencapture("Addcontact_Click_Newchat");
        new_contact_btn.click();
        Thread.sleep(1000);
        cu.screencapture("Addcontact_Click_Newchat");
        first_name.sendKeys(getPropertyByKey("NewName"));
        getDriver().navigate().back();
        cu.screencapture("Addcontact_Click_Newchat");
        phone_num.sendKeys(getPropertyByKey("NewContactnumber"));
        Thread.sleep(2000);
        cu.screencapture("Addcontact_Click_Newchat");
        getDriver().navigate().back();
        //save_btn.click();
        save_contact.click();
        Thread.sleep(3000);
        cu.screencapture("Addcontact_save");
        send_mgs_Contact.click();
        Thread.sleep(2000);
        cu.screencapture("Addcontact_sendmsg");
        cu.rotateDeviceToLandscapeMode();
        send_mgs.sendKeys(getPropertyByKey("Sendmessage"));
        cu.screencapture("Addcontact_sendmsg");
        Thread.sleep(2000);
        send_btn.click();
        cu.rotateDeviceToPotraitMode();
        cu.screencapture("Addcontact_sendbtn");
        //cu.Share

        AndroidTouchAction touch3 = new AndroidTouchAction(driver);
        touch3.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(Share)));
        touch3.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)));
        touch3.release().perform();
        Forward.click();
        Thread.sleep(1000);
        Forward_person.click();
        Thread.sleep(2000);
        Forward_send.click();


        Thread.sleep(1000);
        Camerabutton.click();
        Thread.sleep(1000);
        cu.screencapture("Addcontact_camerabtn");
        Shuttercameraclick.click();
        Thread.sleep(2000);
        cu.screencapture("Addcontact_shuttercamera");
        camerashutter.click();
        Thread.sleep(1000);
        getDriver().navigate().back();
        getDriver().navigate().back();
        getDriver().navigate().back();
    }
           // getDriver().navigate().back();

        //   save_contact.click();
           /*// Thread.sleep(2000);
         //   save_btn.click();
            Thread.sleep(2000);
            save_contact.click();*/
         //getDriver().navigate().back();
     //   Thread.sleep(1000);
   //     getDriver().navigate().back();




    /*public void sendMessage(){
        serchContactByname.click();
        search_src_text.sendKeys(getPropertyByKey("NewName"));
        try{
            Thread.sleep(2000);

        }catch (Exception e){

        }
        requiredName.click();
        //attach_ele.click();
        send_mgs.sendKeys("hiiiii");
        getDriver().navigate().back();
        send_btn.click();
        getDriver().navigate().back();

    }*/
    public void voice_Call() throws InterruptedException {
        Thread.sleep(3000);
        serchContactByname.click();
        cu.screencapture("Voicecall_contactname");
        Thread.sleep(1000);
        search_src_text.sendKeys(getPropertyByKey("NewName"));
        Thread.sleep(1000);
        requiredName.click();
        cu.screencapture("Voicecall_name");
        Thread.sleep(2000);
        whatsAppCall.click();
        Thread.sleep(2000);
//       whatsAppCall1.click();
        Thread.sleep(2000);
        whatsAppCall_end.click();
        cu.screencapture("Voicecall_Endcall");
        Thread.sleep(2000);
       /* getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().back();*/
    }


    /*public void video_Call(){
        topBar_call.click();
        serchContactByname.click();
        search_src_text.sendKeys(getPropertyByKey("NewName"));
        whatsAppvideoCall.click();
        whatsAppCall_end.click();
        getDriver().navigate().back();
    }*/

    public void Videocall() throws InterruptedException {
    /*    Thread.sleep(2000);
        serchContactByname.click();
        Thread.sleep(1000);
        search_src_text.sendKeys(getPropertyByKey("NewName"));
        Thread.sleep(1000);
        requiredName.click();
        Thread.sleep(1000);*/

        whatsAppvideoCall.click();
       // Thread.sleep(3000);
//        whatsAppCall.click();
        Thread.sleep(5000);
        whatsAppvideoCall_end.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        /*Thread.sleep(2000);
        getDriver().navigate().back();*/

        //ssThread.sleep(2000);
    }

        public void Status() throws InterruptedException {
            Thread.sleep(2000);
            topBar_Status.click();
            cu.screencapture("Status");
            Thread.sleep(1000);
            //serchContactByname.click();
           // Thread.sleep(1000);
            S_cameraclick.click();
            cu.screencapture("Status_click");
            Thread.sleep(1000);
            S_Doubletap.click();
            cu.screencapture("Status_doubletap");
            Thread.sleep(2000);
            camerashutter.click();
            Thread.sleep(1000);
            S_cameraclick.click();
            Thread.sleep(1000);
            cu.screencapture("Status_cam_switch");

            S_Cameraswitch.click();

            /*List<WebElement> Contact = getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"Switch camera\"]"));
            try{
                for (int i=0; i <=5; i ++) {
                    Contact.get(i).click();
                }
            }catch (Exception e){

            }*/


            AndroidTouchAction touch = new AndroidTouchAction(driver);
            touch.longPress(LongPressOptions.longPressOptions()
                    .withElement(ElementOption.element(S_Doubletap)));
            touch.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)));
            touch.release().perform();
            Thread.sleep(2000);
            camerashutter.click();
            Thread.sleep(2000);
            getDriver().navigate().back();
            Thread.sleep(2000);
    }



}