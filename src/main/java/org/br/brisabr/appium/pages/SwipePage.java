package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;

public class SwipePage extends BasePage {

    public boolean validarTextoTelaSwipe(String texto) {
        return encontrarElementoPorTexto(texto);
    }


}
