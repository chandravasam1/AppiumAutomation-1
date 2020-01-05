package com.automation.appium.Utils;

import com.automation.appium.DataBean.Direction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import static com.automation.appium.Utils.DriverUtils.getDriver;
import static io.appium.java_client.touch.offset.PointOption.point;


public class ScrollUtils {

    public static void swipeFunction(Direction direction) {
        Dimension size = getDriver().manage().window().getSize();


        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;
        TouchAction perform;

        switch (direction) {
            case DOWN:
                startX = size.width / 2;
                startY = (int) (size.height * 0.20);
                endY = (int) (size.height * 0.80);
                new TouchAction(getDriver())
                        .longPress(point(startX, startY))
                        .moveTo(point(startX, endY))
                        .release().perform();
                break;

            case UP:
                startX = size.width / 2;
                startY = (int) (size.height * 0.80);
                endY = (int) (size.height * 0.20);
                new TouchAction(getDriver())
                        .longPress(point(startX, startY))
                        .moveTo(point(startX, endY))
                        .release().perform();
                break;

            case RIGHT:

                startY = size.height / 2;
                startX = (int) (size.width * 0.10);
                endX = (int) (size.width * 0.90);

                new TouchAction(getDriver())
                        .longPress(point(startX, startY))
                        .moveTo(point(endX, startY))
                        .release().perform();
                break;


            case LEFT:
                startY = size.height / 2;
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.10);

                new TouchAction(getDriver())
                        .longPress(point(startX, startY))
                        .moveTo(point(endX, startY))
                        .release().perform();
                break;

        }

    }

    public static void scrollToElementAndClick(AndroidElement element, int... noOfSwipes) {

        int noOfSwiprCount = noOfSwipes.length>0? noOfSwipes[0] : 20;
        while (noOfSwiprCount > 0) {
            try {
                if(element.isDisplayed()){
                    break;
                }
            } catch (Exception e) {
                swipeFunction(Direction.UP);
            }
            noOfSwiprCount--;
        }
        element.click();
    }
//Ternory operator
    //Variable Argument
    public static void main(String[] args) {
        int a=8;
        if(a>5) {
            a=9;
        } else {
            a=0;
        }

        int result = a>5 ? 9 : 0;
        System.out.println(a);
        System.out.println(result);
    }
}
