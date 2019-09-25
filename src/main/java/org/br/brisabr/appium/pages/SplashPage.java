package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class SplashPage extends BasePage {

    /************************ MAPEAMENTO DE ELEMENTOS E AÇÕES NA TELA SPLASH **************************/

    public boolean splashVisivel() {
        return encontrarElementoPorTexto("Splash!");
    }

    public void aguardarSplashSumir() {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
    }


}
