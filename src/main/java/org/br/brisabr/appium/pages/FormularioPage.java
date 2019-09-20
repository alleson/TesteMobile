package org.br.brisabr.appium.pages;

import io.appium.java_client.MobileBy;
import org.br.brisabr.appium.core.BasePage;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage {

    /************************ MAPEAMENTO DE ELEMENTOS E AÇÕES NA TELA DE FORMULARIO **************************/

    public void escreverNome(String nome) {
        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public String obterNome() {
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor) {
        selecionaCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String obterValorDoCombo() {
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck() {
        clicar(By.className("android.widget.CheckBox"));
    }

    public void clicarSwitch() {
        clicar(MobileBy.AccessibilityId("switch"));
    }

    public boolean statusCheckbox() {
        return statusCheckbox(By.className("android.widget.CheckBox"));
    }

    public boolean statusSwitch() {
        return statusSwitch(MobileBy.AccessibilityId("switch"));
    }

    public void salvarFormulario() {
        clicarPorTexto("SALVAR");
    }

    public String obterNomeCadastro() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
    }

    public String obterConsoleCadastro() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
    }

    public String obterCheckCadastro() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
    }

    public String obterSwitchCadastro() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
    }


}
