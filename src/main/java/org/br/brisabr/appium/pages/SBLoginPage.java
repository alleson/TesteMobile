package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;
import org.openqa.selenium.By;

public class SBLoginPage extends BasePage {

    public void setEmail(String email) {
        escrever(By.xpath("//*[@text='Nome']"), email);
    }

    public void setSenha(String senha) {
        escrever(By.xpath("//*[@text='Senha']"), senha);
    }

    public void entrar() {
        clicarPorTexto("ENTRAR");
    }
}
