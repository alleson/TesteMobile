package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.AccordionPage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class AccordionTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AccordionPage accordion = new AccordionPage();

    @Test
    public void interagirAccordion() {
        //acessar accordion
        menu.acessarAccordion();

        //acessar op 1
        accordion.selecionarOpcao("Opção 1");

        //verificar texto
        esperar(2000);
        Assert.assertEquals("Esta é a descrição da opção 1", accordion.obterValorOpcao("Opção 1"));

    }
}
