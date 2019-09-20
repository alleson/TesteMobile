package org.br.brisabr.appium.core;

import org.openqa.selenium.By;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class BasePage {

    /********************** MÉTODOS PARA ESCRITA *************************/

    public void escrever(By by, String texto) {
        getDriver().findElement(by).sendKeys(texto);
    }

    /********************** MÉTODOS PARA OBTER TEXTO **********************/

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    /********************* MÉTODOS PARA COMBOBOX *************************/

    public void selecionaCombo(By by, String valor) {
        //Clicar combo
        getDriver().findElement(by).click();

        //Selecionar opcao
        clicarPorTexto(valor);
    }

    /*************************** MÉTODOS PARA CLIQUE ***********************/

    public void clicar(By by) {
        getDriver().findElement(by).click();
    }


    public void clicarPorTexto(String texto) {
        getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();
    }


    /************************** MÉTODOS DE STATUS **************************/

    public boolean statusCheckbox(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean statusSwitch(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }
}
