/*
package com.automation.appium.Tests;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Zoom {
        {
            AndroidDriver driver;

            public void test1() throws Exception{
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.4");
            capabilities.setCapability("deviceName", "sagarcell");
            capabilities.setCapability("browser_Name", "Android");
            capabilities.setCapability("appPackage", "com.sec.android.app.camera");
            capabilities.setCapability("appActivity","com.sec.android.app.camera.Camera");

            try {
                driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities) {
                };

                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Thread.sleep(5000);
                WebElement e= driver.findElement(By.className("android.widget.LinearLayout"));

                driver.zoom
                Thread.sleep(5000);
                driver.pinch(e);
                Thread.sleep(5000);
            }catch(Exception ex) {
                System.out.println(ex.toString());


            }finally {
                //quit the browser
                driver.quit();
            }

        }
        }
    }

*/
