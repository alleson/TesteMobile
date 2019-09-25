package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;

public class AbaPage extends BasePage {

    public boolean validarConteudoAba(String texto) {
        return encontrarElementoPorTexto(texto);
    }

    public void alterarAba(String texto) {
        clicarPorTexto(texto);
    }
}
