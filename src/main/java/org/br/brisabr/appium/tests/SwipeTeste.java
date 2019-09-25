package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class SwipeTeste extends BaseTest {

    private MenuPage menu = new MenuPage();

    @Test
    public void realizarSwipe(){
        //acessar a tela Swipe
        menu.acessarSwipe();

        //verificar o texto primeira tela
        Assert.assertEquals(menu.encontrarElementoPorTexto());
    }
}
