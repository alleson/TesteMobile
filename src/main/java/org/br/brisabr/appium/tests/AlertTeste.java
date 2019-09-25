package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.AlertaPage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.management.MemoryUsage;


public class AlertTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AlertaPage alerta = new AlertaPage();

    @Before
    public void setup() {
        //acessar menu alerta
        menu.acessarAlertas();
    }

    @Test
    public void confirmarAlerta() {
        //clicar em alerta confirm
        alerta.clicarAlertaConfirm();

        //verificar texto pop up
        Assert.assertEquals("Info", alerta.obterTituloAlerta());
        Assert.assertEquals("Confirma a operação?", alerta.obterMensagemAlerta());

        //clicar em confirmacao de alerta
        alerta.confirmar();

        //verificar nova mensagem
        Assert.assertEquals("Confirmado", alerta.obterMensagemAlerta());

        //sair do pop up
        alerta.sair();

        //validar tela de alerta
        Assert.assertTrue(alerta.validarTelaAlerta());

    }

    @Test
    public void clicarForaDoAlerta() {
        //clicar no alerta
        alerta.clicarAlertaSimples();

        //clicar fora da caixa
        esperar(2000);
        alerta.clicarForaDaCaixa();

        //verificar texto que nao esta presente
        Assert.assertFalse(alerta.encontrarElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
    }
}
