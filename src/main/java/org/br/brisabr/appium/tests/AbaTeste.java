package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.AbaPage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Test;


public class AbaTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AbaPage aba = new AbaPage();

    @Test
    public void interagirComAbas() {
        //acessar menu abas
        menu.acessarAbas();

        //verificar que esta na aba 1
        aba.validarConteudoAba("Este é o conteúdo da Aba 1");

        //acessar aba 2
        aba.alterarAba("ABA 2");

        //verificar que esta na aba 2
        aba.validarConteudoAba("Este é o conteúdo da Aba 2");
    }
}
