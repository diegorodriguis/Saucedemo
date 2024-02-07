package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class FuncionalidadeLoginTeste {

	HomePage home = new HomePage();

	@Given("que esteja na tela de login {string}")
	public void queEstejaNaTelaDeLogin(String url) {
		home.telaDeLogin(url);

	}

	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {
		home.dadosDeLogin("standard_user");
		home.dadosDeLogin("secret_sauce");

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		home.login();

	}

	@When("preencher o usuario")
	public void preencherOUsuario() {
		home.dadosSenhaEmBranco("standard_user");

	}

	@When("nao  preencher a senha")
	public void naoPreencherASenha() {
		home.dadosSenhaEmBranco("");
		

	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		home.login();


	}

	@Then("login nao realizado com mensagem de senha obrigatoria")
	public void loginNaoRealizadoComMensagemDeSenhaObrigatoria() {
		home.dadosSenhaEmBranco("Epic sadface: Password is required");

	}
	
	@When("nao  preencher o usuario")
	public void naoPreencherOUsuario() {
		home.dadosUsuarioEmBranco("");
	   
	}
	@Then("login nao realizado com mensagem de usuario obrigatoria")
	public void loginNaoRealizadoComMensagemDeUsuarioObrigatoria() {
		home.dadosUsuarioEmBranco("Epic sadface: Username is required");
	    
	}

}
