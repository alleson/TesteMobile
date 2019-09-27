package org.br.brisabr.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.List;

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

    /************************ VALIDA ELEMENTOS PRESENTE NA TELA ***********************/
    public boolean encontrarElementoPorTexto(String texto) {
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text = '" + texto + "']"));
        return elementos.size() > 0;
    }

    /******************** VALIDA MENSAGENS DE ALERTAS ******************************/
    public String obterTituloAlerta() {
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagemAlerta() {
        return obterTexto(By.id("android:id/message"));
    }

    /*********************** TOCAR EM UM PONTO ESPECIFICO DA TELA *******************/
    public void tap(int x, int y) {
        new TouchAction(getDriver()).tap(PointOption.point(x, y)).perform();
    }

    /*********************** REALIZAR SCROLL NA TELA *********************/
    public void scroll(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int x = size.width / 2;

        int yInicial = (int) (size.height * inicio);
        int yFinal = (int) (size.height * fim);

        new TouchAction(getDriver()).longPress(PointOption.point(x, yInicial)).moveTo(PointOption.point(x, yFinal))
                .release().perform();
    }

    public void scrollDown() {
        scroll(0.9, 0.1);
    }

    public void scrollUp() {
        scroll(0.1, 0.9);
    }

    /*********************** REALIZAR SWIPE NA TELA *********************/
    public void swipe(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int y = size.height / 2;

        int xInicial = (int) (size.width * inicio);
        int xFinal = (int) (size.width * fim);

        new TouchAction(getDriver()).longPress(PointOption.point(xInicial, y)).moveTo(PointOption.point(xFinal, y))
                .release().perform();
    }

    public void swipeLeft() {
        swipe(0.1, 0.9);
    }

    public void swipeRight() {
        swipe(0.9, 0.1);
    }

    /*************************** SWIPE EM ELEMENTO *************************/
    public void swipeElemento(MobileElement element, double inicio, double fim) {
        int y = element.getLocation().y + (element.getSize().height / 2);

        int xInicial = (int) (element.getSize().width * inicio);
        int xFinal = (int) (element.getSize().width * fim);

        new TouchAction(getDriver()).longPress(PointOption.point(xInicial, y)).moveTo(PointOption.point(xFinal, y))
                .release().perform();
    }
}
