package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;
import org.openqa.selenium.By;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class SwipeListPage extends BasePage {

    public void swipeListElementLeft(String opcao) {
        swipeElemento(getDriver().findElement(By.xpath("//*[@text = '" + opcao + "']/..")), 0.9, 0.2);
    }

    public void swipeListElementRight(String opcao) {
        swipeElemento(getDriver().findElement(By.xpath("//*[@text = '" + opcao + "']/..")), 0.1, 0.9);
    }

    public boolean validarTextoDaOpcao(String texto) {
        return encontrarElementoPorTexto(texto);
    }

    public void clicarNoBotaoMais() {

    }
}
