package com.automation.appium.Utils;

import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.WaitUtils.waitForVisible;

public class CommonUtils {
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void clickOnElement(AndroidElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void sendKeysTo(AndroidElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public static void rotateDeviceToLandscapeMode(){
        getDriver().rotate(ScreenOrientation.LANDSCAPE);
    }

    public static void rotateDeviceToPotraitMode(){
        getDriver().rotate(ScreenOrientation.PORTRAIT);
    }

    public  void screencapture(String name){
        File srcFile = getDriver().getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        File targetFile = new File("./result/" + name +" "+timestamp+".png");

        try {
            FileUtils.copyFile(srcFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


     /*   public  void screencapture(String name){
            File srcFile = getDriver().getScreenshotAs(OutputType.FILE);

            File targetFile = new File("./result/" + name +".png");
            try {
                FileUtils.copyFile(srcFile, targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
*/

/*        // Take screenshot method
        public void captureScreenshot(String fileName,String extension)throws IOException
        {

// Take the screenshot and store as file format
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// Open the current date and time
            String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

//Copy the screenshot on the desire location with different name using current date and time
            FileUtils.copyFile(scrFile, new File("C:/shots/" + fileName+" "+timestamp+extension));
        }*/


  /*  public  void screencapture(String name){
        File srcFile = getDriver().getScreenshotAs(OutputType.FILE);
        File targetFile = new File("./result/" + name +".png");
         return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        try {
            FileUtils.copyFile(srcFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }*/






        /*public static String captureScreenshot(WebDriver driver, String screenshotName) {

            try
            {
                TakesScreenshot ts = (TakesScreenshot) driver;

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source, new File ("./screenshots/"+ screenshotName + ".jpg"));

                return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
            }
            catch (Exception e)
            {

                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
            return screenshotName;
        }
*/








        /*Object folder_name = "screenshot";
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Date format fot screenshot file name
        df=new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        //create dir with given folder name
        new File(folder_name).mkdir();
        //Setting file name
        String file_name=df.format(new Date())+".png";
        //coppy screenshot file into screenshot folder.
        FileUtils.copyFile(f, new File(folder_name + "/" + file_name));*/
    }}



