package org.br.brisabr.appium.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.br.brisabr.appium.core.BasePage;
import org.br.brisabr.appium.core.DriverFactory;
import org.openqa.selenium.By;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class CliquePage extends BasePage {

    public void cliqueLongo() {
        new TouchAction(getDriver()).longPress(ElementOption.element(getDriver()
                .findElement(By.xpath("//*[@text='Clique Longo']")))).perform();
    }

    public String obterTextoDoCampo() {
        return obterTexto(By.xpath("(//android.widget.TextView)[3]"));
    }

}
