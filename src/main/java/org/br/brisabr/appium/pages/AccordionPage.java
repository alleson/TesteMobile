package org.br.brisabr.appium.pages;

import org.br.brisabr.appium.core.BasePage;
import org.openqa.selenium.By;

public class AccordionPage extends BasePage {

    public void selecionarOpcao(String opcao){
        clicarPorTexto(opcao);
    }

    public String obterValorOpcao(String opcao) {
        return obterTexto(By.xpath("//*[@text='"+opcao+"']/../../following-sibling::android.view.ViewGroup//android.widget.TextView"));
    }

}
