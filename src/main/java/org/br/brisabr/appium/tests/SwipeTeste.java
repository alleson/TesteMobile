package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.MenuPage;
import org.br.brisabr.appium.pages.SwipePage;
import org.junit.Assert;
import org.junit.Test;

public class SwipeTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SwipePage swipe = new SwipePage();

    @Test
    public void realizarSwipe() {
        //acessar a tela Swipe
        menu.acessarSwipe();

        //verificar o texto primeira tela
        Assert.assertTrue(swipe.validarTextoTelaSwipe("a esquerda"));

        //deslizar para a segunda tela
        menu.swipeRight();

        //verificar o texto da segunda tela
        Assert.assertTrue(swipe.validarTextoTelaSwipe("E veja se"));

        //clicar botao para direita
        menu.clicarPorTexto("›");

        //validar texto da terceira tela
        Assert.assertTrue(swipe.validarTextoTelaSwipe("Chegar até o fim!"));

        //clicar botao para esquerda
        menu.clicarPorTexto("‹");

        //validar a segunda tela novamente
        Assert.assertTrue(swipe.validarTextoTelaSwipe("E veja se"));

    }
}
