package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.FormularioPage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class FormularioTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private FormularioPage form = new FormularioPage();


    @Before
    public void inicializarAppium() throws MalformedURLException {
        menu.acessarFormulario();
    }

    /**************************************** CAMPO TEXTO ***********************************/
    @Test
    public void preencherCampoTexto() throws MalformedURLException {
        form.escreverNome("Alleson");

        //Checar nome escrito
        assertEquals("Alleson", form.obterNome());
    }


    /************************************* COMBO BOX *******************************************/
    @Test
    public void interagirCombo() throws MalformedURLException {
        //Selecionar opcao combo
        form.selecionarCombo("PS4");

        //Verificar Opcao
        assertEquals("PS4", form.obterValorDoCombo());
    }

    /************************************* CHECKBOX and SWITCH ****************************************/
    @Test
    public void interagirCheckboxSwitch() throws MalformedURLException {

        //Verificar status dos elementos
        assertFalse(form.statusCheckbox());
        assertTrue(form.statusSwitch());

        //Clicar nos elementos
        form.clicarCheck();
        form.clicarSwitch();

        //Verificar estados alterados
        assertTrue(form.statusCheckbox());
        assertFalse(form.statusSwitch());
    }

    /********************************** CADASTRO ***************************************************/
    @Test
    public void validarCadastro() throws MalformedURLException {


        //Escrever nome
        form.escreverNome("Alleson");

        //Selecionar opcao no combo
        form.selecionarCombo("PS4");

        //Clicar nos elementos Switch e checkbox
        form.clicarCheck();
        form.clicarSwitch();

        //Clicar para salvar o cadastro
        form.salvarFormulario();

        //Validar cadastro
        assertEquals("Nome: Alleson", form.obterNomeCadastro());
        assertEquals("Console: ps4", form.obterConsoleCadastro());
        assertTrue(form.obterSwitchCadastro().endsWith("Off"));
        assertTrue(form.obterCheckCadastro().endsWith("Marcado"));

    }
}
