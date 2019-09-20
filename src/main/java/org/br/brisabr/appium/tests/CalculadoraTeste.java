package org.br.brisabr.appium.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraTeste {

    @Test
    public void somaDoisValores() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "9885b5314b5a464556");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        AndroidDriver<MobileElement> driver = driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),
                desiredCapabilities);
        MobileElement el1 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Plus");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult");
        System.out.println(el4.getText());
        Assert.assertEquals("4", el4.getText());


        driver.quit();
    }
}
