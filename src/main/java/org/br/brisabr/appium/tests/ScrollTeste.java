package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class ScrollTeste {

    private MenuPage menu = new MenuPage();

    @Test
    public void encontrarOpcaoEscondida() {
        //scroll down
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
        System.out.println("Encontrou");
        menu.scrollDown();

        //clicar na opcao
        menu.acessarOpcaoEscondida();

        //verificar mensagem
        Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());

        //sair mensagem
        menu.clicarPorTexto("OK");
    }
}
