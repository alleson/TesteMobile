package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarFormulario() {
        clicarPorTexto("Formulário");
    }

    public void acessarSplash() {
        clicarPorTexto("Splash");
    }

    public void acessarAlertas() {
        clicarPorTexto("Alertas");
    }

    public void acessarAbas() {
        clicarPorTexto("Abas");
    }

    public void acessarAccordion() {
        clicarPorTexto("Accordion");
    }

    public void acessarCliques() {
        clicarPorTexto("Cliques");
    }

    public void acessarOpcaoEscondida() {
        clicarPorTexto("Opção bem escondida");
    }

    public void acessarSwipe(){
        clicarPorTexto("Swipe");
    }
}
