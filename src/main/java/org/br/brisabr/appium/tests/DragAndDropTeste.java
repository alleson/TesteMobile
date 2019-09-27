package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.core.DriverFactory;
import org.br.brisabr.appium.pages.DragAndDropPage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.br.brisabr.appium.core.DriverFactory.getDriver;

public class DragAndDropTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private DragAndDropPage drag = new DragAndDropPage();

    private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,",
            "e arraste para", "qualquer local desejado."};
    private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,",
            "e arraste para", "Esta", "qualquer local desejado."};
    private String[] estadoFinal = new String[]{"Faça um clique longo,", "é uma lista", "Drag em Drop!",
            "e arraste para", "Esta", "qualquer local desejado."};

    @Test
    public void realizarDragDrop() {
        //acessar menu
        menu.acessarDragAndDrop();

        //verificar estado inicial
        esperar(5000);
        Assert.assertArrayEquals(estadoInicial, drag.obterLista());

        //Arrastar o primeiro elemento para quinta posicao

        drag.arrastar("Esta", "e arraste para");

        //verificar estado intermediario
        Assert.assertArrayEquals(estadoIntermediario, drag.obterLista());

        //arrastar terceiro elemento primeira posicao

        drag.arrastar("Faça um clique longo,", "é uma lista");

        //verificar estado final
        Assert.assertArrayEquals(estadoFinal, drag.obterLista());
    }
}

