package com.automation.appium.listeners;
import java.io.File;
import java.io.FileOutputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotpathloc {

        private WebDriver driver;
        private final String folderPath = "./src/test/resources/screenshots/";

        public void Screenshot(WebDriver driver) {
            this.driver = driver;
            validateFolderExists();
        }

        private void validateFolderExists() {
            File folder = new File(folderPath);
            if (!folder.exists())
                folder.mkdir();
        }

        public void capture(String fileName) {
            try {
                String name = folderPath + fileName + ".png";
                FileOutputStream file = new FileOutputStream(name);
                file.write(
                        ((TakesScreenshot) driver)
                                .getScreenshotAs(OutputType.BYTES));
                file.close();
            }
            catch (Exception ex) {
                throw new RuntimeException("cannot create screenshot;", ex);
            }

        }

    public void Screenshot() {
            
    }

    public void capture() {
    }
}


