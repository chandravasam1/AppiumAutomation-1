package com.automation.appium.Utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;
import static com.automation.appium.Utils.PropertyUtils.loadProperties;
import org.openqa.selenium.remote.RemoteWebDriver;



public class DU1 {
        public static DesiredCapabilities capabilities = new DesiredCapabilities();
        protected static final AndroidKey KEYCODE_APP_SWITCH = null;
        public static AndroidDriver<MobileElement> driver;
    private final int port;


    //public static AllureCommandline Xl;
        public  static void initDriver(int p) throws Exception {


            if (driver == null) {
                startServer();
                // startAppiumServer();

                loadProperties();

                capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM, "ANDROID");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A2");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + getPropertyByKey("application.path"));
                // capabilities.setCapability("unlockType", "pin");
                //Thread.sleep(6000);
                // capabilities.setCapability("unlockKey", "000000");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.whatsapp");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.whatsapp.HomeActivity");
//		capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
                //  driver = new RemoteWebDriver(new URL("http://127.0.0.1:"+this.port+"/wd/hub"), capabilities);
                URL url = new URL("http://localhost:4723/wd/hub");
                driver = new AndroidDriver<MobileElement>(url, capabilities);
                // driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
                Thread.sleep(50000);

            }
        }

        public static void startServer () {
            Runtime runtime = Runtime.getRuntime();
            try {
                //4723
                runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
                Thread.sleep(1000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }


        public static void tearDown () throws Exception {
            AppiumServer.stop();
            driver.quit();
        }

    DU1(int port){
        this.port=port;
    }

    public void runTest() {
            try {
                initDriver(5554);     // for emulator on port 5554
                tearDown();
                initDriver(5556);     // for emulator on port 5556
                tearDown();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        public static AndroidDriver getDriver () {
            if (driver == null) {
                try {
                    initDriver();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            return driver;
        }

 

    public static void main (String[]args) throws Exception {
            // Thread.sleep(5000);
            initDriver();
        }

    private static void initDriver() {
    }
}
