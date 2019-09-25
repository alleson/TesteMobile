package org.br.brisabr.appium.tests;

import org.br.brisabr.appium.core.BaseTest;
import org.br.brisabr.appium.pages.FormularioPage;
import org.br.brisabr.appium.pages.MenuPage;
import org.junit.Assert;
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
    public void Cadastro() throws MalformedURLException {


        //Escrever nome
        form.escreverNome("Alleson");

        //Selecionar opcao no combo
        form.selecionarCombo("PS4");

        //Clicar nos elementos Switch e checkbox
        form.clicarCheck();
        form.clicarSwitch();

        //Clicar para salvar o cadastro
        form.salvar();

        //Validar cadastro
        assertEquals("Nome: Alleson", form.obterNomeCadastro());
        assertEquals("Console: ps4", form.obterConsoleCadastro());
        assertTrue(form.obterSwitchCadastro().endsWith("Off"));
        assertTrue(form.obterCheckCadastro().endsWith("Marcado"));

    }

    @Test
    public void CadastroDemorado() throws MalformedURLException {


        //Escrever nome
        form.escreverNome("Alleson");

        //Clicar para salvar o cadastro
        form.salvarDemorado();

        //Validar cadastro
        assertEquals("Nome: Alleson", form.obterNomeCadastro());

    }

    @Test
    public void alterarData(){
        form.clicarData("01/01/2000");
        form.selecionarDia("15");
        form.confirmaData();

        Assert.assertTrue(form.encontrarElementoPorTexto("15/2/2000"));
    }

    @Test
    public void interagirSeekBar(){
        //clicar no seekbar
        form.clicarSeekBar(0.49);

        //salvar o valor
        form.salvar();

        //obter o valor
        Assert.assertEquals("Slider: 49", form.obterSliderCadastro());
    }
}
