package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.MenuPage;
import org.br.brisabr.appium.pages.SplashPage;
import org.junit.Assert;
import org.junit.Test;

public class SplashTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage splash = new SplashPage();

    @Test
    public void aguardarSplashSumir() {

        //acessar menu splash
        menu.acessarSplash();

        //verificar que o splash esta sendo exibido
        splash.splashVisivel();

        //aguardar a tela do Splash sumir
        splash.aguardarSplashSumir();

        //verificar que o formulario esta aparecendo
        Assert.assertTrue(splash.encontrarElementoPorTexto("Formulário"));

    }
}
