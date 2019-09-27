package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.MenuPage;
import org.br.brisabr.appium.pages.SwipeListPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class SwipeListTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SwipeListPage swipe = new SwipeListPage();

    /*
    @Test
    public void swipeList() {
        //CLicar Swipe List
        menu.acessarSwipeList();

        // deslizar opcao 1 para esquerda
        swipe.swipeListElementLeft("Opção 1");

        //clicar no botao positivo
        swipe.clicarNoBotaoMais();

        //verificar status da opcao
        Assert.assertTrue(swipe.validarTextoDaOpcao("Opção 1 (+)"));
    }

     */
}
