package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;
import org.openqa.selenium.By;

public class AlertaPage extends BasePage {

    public void clicarAlertaConfirm() {
        clicarPorTexto("ALERTA CONFIRM");
    }

    public void clicarAlertaSimples() {
        clicarPorTexto("ALERTA SIMPLES");
    }


    public void confirmar() {
        clicarPorTexto("CONFIRMAR");
    }

    public void sair() {
        clicarPorTexto("SAIR");
    }

    public boolean validarTelaAlerta() {
        return encontrarElementoPorTexto("ALERTA CONFIRM");
    }

    public void clicarForaDaCaixa() {
        tap(100, 150);
    }
}
