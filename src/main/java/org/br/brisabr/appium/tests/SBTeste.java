package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.MenuPage;
import org.br.brisabr.appium.pages.SBLoginPage;
import org.junit.Before;
import org.junit.Test;

public class SBTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SBLoginPage sb = new SBLoginPage();

    @Test
    public void setup() {
        //Acessar o Seu Barriga Nativo
        menu.acessarSBNativo();
        sb.setEmail("alleson@gmail.com");
        sb.setSenha("1234");
        sb.entrar();
    }

}
