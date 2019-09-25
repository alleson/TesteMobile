package org.br.brisabr.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static AndroidDriver<MobileElement> driver;

    /************************** RETORNAR UM DRIVE CRIADO **********************************/
    public static AndroidDriver<MobileElement> getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }


    /*********************************** CRIANDO O DRIVER APPIUM *************************************/
    private static void createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "9885b5314b5a464556");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\aalbuquerque\\TesteMobile\\src\\main\\resources\\CTAppium-1-1.apk");

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),
                    desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /*************************** FINALIZA O DRIVE ***************************/
    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
