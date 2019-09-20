package org.br.brisabr.appium.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    /**************** Regra para nome de cada Screenshot ***************/
    @Rule
    public TestName testName = new TestName();

    /***************** Método executado no final de todos os testes *****************/
    @AfterClass
    public static void finalizaClasse() {
        DriverFactory.killDriver();
    }

    /***************** Método executado ao final de cada teste ***************/
    @After
    public void tearDown() {
        gerarScreenshot();
        DriverFactory.getDriver().resetApp();
    }

    /********* Gerar um Screenshot de cada teste *************/
    public void gerarScreenshot() {
        File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, new File("target/screenshots/"+testName.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
