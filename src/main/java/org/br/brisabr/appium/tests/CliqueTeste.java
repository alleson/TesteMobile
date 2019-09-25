package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.CliquePage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class CliqueTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private CliquePage clique = new CliquePage();

    @Test
    public void realizarCliqueLongo() {
        //acessar tela cliques
        menu.acessarCliques();

        //clique longo
        clique.cliqueLongo();

        //validar texto
        Assert.assertEquals("Clique Longo", clique.obterTextoDoCampo());
    }

    @Test
    public void realizarCliqueDuplo() {
        //acessar tela cliques
        menu.acessarCliques();
        //clique duplo
        clique.clicarPorTexto("Clique Duplo");
        clique.clicarPorTexto("Clique Duplo");
        //validar texto
        Assert.assertEquals("Duplo Clique", clique.obterTextoDoCampo());
    }
}
