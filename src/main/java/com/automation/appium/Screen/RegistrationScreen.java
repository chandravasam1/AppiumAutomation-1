package com.automation.appium.Screen;

import com.automation.appium.DataBean.UserDetails;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;

//Alt enter to import the methods
public class RegistrationScreen {
   public RegistrationScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);

    }

    @AndroidFindBy(id = "com.whatsapp:id/eula_accept")
    public AndroidElement R_AgreeandContinue;

    @AndroidFindBy (id="com.whatsapp:id/registration_country")
    public AndroidElement R_Selectcountry;

/*    @AndroidFindBy (id=" com.whatsapp:id/menuitem_search")
    public AndroidElement R_menuitem_search;*/

    //android.widget.TextView[@content-desc="Search"]
    @AndroidFindBy (xpath="//android.widget.TextView[@content-desc=\"Search\"]")
    public AndroidElement R_search;

    @AndroidFindBy(id = "com.whatsapp:id/search_src_text")
    public AndroidElement R_search_src_text;

    @AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout")
    public AndroidElement R_Selectcountryfromdropdown;

   /* @AndroidFindBy (id = "com.whatsapp:id/registration_cc")
    public AndroidElement countrycode;*/

    @AndroidFindBy (id = "com.whatsapp:id/registration_phone")
    public AndroidElement Phonenumber;

    @AndroidFindBy (id = "com.whatsapp:id/registration_submit")
    public AndroidElement Submit;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    public AndroidElement Phonenumber_OK;

    @AndroidFindBy (id = "com.whatsapp:id/submit")
    public AndroidElement Continue_Submit;


    @AndroidFindBy (id = "com.android.permissioncontroller:id/permission_allow_button")
    public AndroidElement Allow_permission;

    @AndroidFindBy (id = "com.whatsapp:id/dont_restore")
    public AndroidElement Skip;

    @AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Skip restore\"]")
    public AndroidElement Skip_Restore;

    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Profile photo\"]")
    public AndroidElement Profile_pic;

    @AndroidFindBy (id = "com.whatsapp:id/registration_name")
    public AndroidElement registration_name;

    @AndroidFindBy (xpath = "  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    public AndroidElement R_Camera;

    @AndroidFindBy(id = "com.oppo.camera:id/camera_from_other_app_close_btn")
    public AndroidElement R_Shuttercameraclick;

    @AndroidFindBy(id = "com.oppo.camera:id/done_button")
    public AndroidElement R_Shuttercameraclick_done;

    @AndroidFindBy(id = "com.whatsapp:id/ok_btn")
    public AndroidElement R_Shuttercameraclick_done_ok;

    @AndroidFindBy(id = " com.whatsapp:id/registration_name")
    public AndroidElement Registration_name;



    public void fillRegistrationInfo() throws InterruptedException {
       /* UserDetails userDetails = new UserDetails();
        userDetails.generateRandomData();*/
        //Thread.sleep(2000);
        R_AgreeandContinue.click();
        Thread.sleep(1000);
        R_Selectcountry.click();
        Thread.sleep(2000);
        R_search.click();
        Thread.sleep(2000);
        R_search_src_text.sendKeys(getPropertyByKey("Selectcountry"));
        Thread.sleep(1000);
        R_Selectcountryfromdropdown.click();
        Thread.sleep(1000);
        //countrycode.sendKeys(getPropertyByKey("Countrycode"));
       // Thread.sleep(1000);
        Phonenumber.sendKeys(getPropertyByKey("Phonenumber"));
        Thread.sleep(1000);
        Submit.click();
        Thread.sleep(3000);
        Phonenumber_OK.click();
        Thread.sleep(8000);
        Continue_Submit.click();
        Thread.sleep(1000);
        Allow_permission.click();
       Thread.sleep(1000);
       Allow_permission.click();
        Thread.sleep(2000);
        Skip.click();
        Thread.sleep(2000);
        Skip_Restore.click();
        Thread.sleep(2000);
        Profile_pic.click();
        Thread.sleep(1000);
        R_Camera.click();
        Thread.sleep(1000);
        //........pasted

        Allow_permission.click();
        Thread.sleep(1000);
        R_Shuttercameraclick.click();
        Thread.sleep(1000);
        R_Shuttercameraclick_done.click();
        Thread.sleep(1000);
        R_Shuttercameraclick_done_ok.click();
        Thread.sleep(3000);
        Registration_name.sendKeys(getPropertyByKey("Registration_name"));
        Thread.sleep(3000);
        Submit.click();
        Thread.sleep(5000);
        //Allow_permission.click();

    }


}
