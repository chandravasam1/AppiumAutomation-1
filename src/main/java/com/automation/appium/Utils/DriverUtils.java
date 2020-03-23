package com.automation.appium.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
//import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;
import static com.automation.appium.Utils.PropertyUtils.loadProperties;
//import org.automationtesting.excelreport.Xl;

public class DriverUtils {


    public static AppiumDriverLocalService service;
    public static AppiumDriverLocalService startServer1(){

        AppiumDriverLocalService.buildDefaultService();
        service.start();
        return service;
    }

    public static DesiredCapabilities capabilities = new DesiredCapabilities();
    protected static final AndroidKey KEYCODE_APP_SWITCH = null;
    public static AndroidDriver<MobileElement> driver;
    private static MobileElement row;

    public static void initDriver() throws Exception {


       /* String path  = "E:\\RecordandAuthentication.Bat";
        File file = new File(path);*/
      //  File executable = new File(directory + "/" +batfile);

       // commandLine.setExecutable(executable.getAbsolutePath());
      /*  final Runtime rt = Runtime.getRuntime();
        rt.exec("adb shell input keyevent 224");*/


       if (driver == null) {
         //  Unlock();
      //  service= startServer1();

           startServer ();
            // startAppiumServer()
            loadProperties();

            capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM, "ANDROID");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A2");
          // capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
           capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + getPropertyByKey("application.path"));
            // capabilities.setCapability("unlockType", "pin");
            //Thread.sleep(6000);
            // capabilities.setCapability("unlockKey", "000000");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.whatsapp");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.whatsapp.HomeActivity");
           capabilities.setCapability("automationName", "UiAutomator2");
          /* capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.os.docvault");
           capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.colors.oppodocvault.views.WelcomeActivity");*/
           capabilities.setCapability("autoGrantPermissions","true");
        capabilities.setCapability("automationName", "UiAutomator2");
           //--session-override	false
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);

            try {
                URL url = new URL("http://localhost:4723/wd/hub");
                driver = new AndroidDriver<>(url, capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

    }

   /* public static void initDriver1() throws Exception {

        //String path  = "E:\\RecordandAuthentication.Bat";
        //File file = new File(path);
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


            try {
                URL url = new URL("http://localhost:4728/wd/hub");
                driver = new AndroidDriver<>(url, capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

    }*/



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
    public static void Unlock() {


        /*ProcessBuilder processBuilder = new ProcessBuilder("C:\\Users\\ccdsru\\Desktop\\Desktop_backup\\MentiAddUsersTest\\MentiRun.bat");
        processBuilder.start();*/
        ProcessBuilder processBuilder1 = new ProcessBuilder("E:\\RecordandAuthentication.Bat");
        //processBuilder1.start();
        try {

            Process process = processBuilder1.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println(output);
                System.exit(0);
            } else {
                //abnormal...
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void stopServer() {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("taskkill /F /IM node.exe");
            runtime.exec("taskkill /F /IM cmd.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


            public static void startAppiumServer () throws IOException {
                killExistingAppiumProcess();
                if (AppiumServer.appium == null || !AppiumServer.appium.isRunning()) {
                    AppiumServer.start();
                }
            }

            public static void killExistingAppiumProcess () throws IOException {

                // String[] cmd={"/usr/bin/killall","-KILL","node"};
                String[] cmd={"taskkill /F /IM node.exe"};

                //  System.out.println("cmddddd"+cmd);
                 Runtime.getRuntime().exec(cmd);
            }
            public static void tearDown () throws Exception {
        //     AppiumServer.stop();
        driver.quit();
        //stopServer();
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

  //  public WebElement row;

    public static void main (String[]args) throws Exception {
                // Thread.sleep(5000);
          //    new  DriverUtils();
           initDriver();
            //Xl.generateReport("E:\\Results","New_Microsoft_Excel_Worksheet.xlsx2");
          //  Xl.generateReport("E:\\Results\\","New_Microsoft_Excel_Worksheet.xlsx");

            }


   /* public DriverUtils() {
        String batfile = "RecordandAuthentication.Bat";
        String directory = "E:\\";
        try {
            runProcess(batfile, directory);
        } catch (CommandLineException e) {
            e.printStackTrace();
        }
    }*/
   /* public void runProcess(String batfile, String directory) throws CommandLineException {

        Commandline commandLine = new Commandline();

        File executable = new File(directory + "/" +batfile);
        commandLine.setExecutable(executable.getAbsolutePath());

        WriterStreamConsumer systemOut = new WriterStreamConsumer(
                new OutputStreamWriter(System.out));

        WriterStreamConsumer systemErr = new WriterStreamConsumer(
                new OutputStreamWriter(System.out));

        int returnCode = CommandLineUtils.executeCommandLine(commandLine, systemOut, systemErr);
        if (returnCode != 0) {
            System.out.println("Something Bad Happened!");
        } else {
            System.out.println("Taaa!! ddaaaaa!!");
        };
    }*/
}