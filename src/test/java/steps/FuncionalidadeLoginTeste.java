package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import runner.Executa;

public class FuncionalidadeLoginTeste {

	HomePage home = new HomePage();

	// deve realizar login com sucesso
	@Given("que esteja na tela de login {string}")
	public void queEstejaNaTelaDeLogin(String url) {
		Executa.configurarAmbiente(url);
	}

	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {
		home.dadosDeLogin();
	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		home.login();
	}

	// nao deve fazer login senha em branco

	@When("preencher o usuario")
	public void preencherOUsuario() {
		home.dadosSenhaEmBranco();
	}

	@When("nao preencher a senha")
	public void naoPreencherASenha() {
	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		home.login();
	}

	@Then("login nao realizado com mensagem de senha obrigatoria")
	public void loginNaoRealizadoComMensagemDeSenhaObrigatoria() {
		home.validaMensagemLoginSenhaEmBranco();
	}
	
	// nao deve fazer login usuario em branco

	@When("nao preencher o usuario")
	public void naoPreencherOUsuario() {
	}

	@When("preencher a senha")
	public void preencherASenha() {
		home.dadosUsuarioEmBranco();
	}

	@Then("login nao realizado com mensagem de usuario obrigatoria")
	public void loginNaoRealizadoComMensagemDeUsuarioObrigatoria() {
		home.validaMensagemLoginUsuarioEmBranco();
	}
	
	//Novas funcionalidades 08/02
	
	
	@When("preencher o usuario com dado invalido")
	public void preencherOUsuarioComDadoInvalido() {
	    
	}
	@When("preencher a senha corretamente")
	public void preencherASenhaCorretamente() {
		home.dadosUsuarioErrado();
	    
	
	    
	}
	@Then("login nao realizado com mensagem de usuario incorreto")
	public void loginNaoRealizadoComMensagemDeUsuarioIncorreto() {
		home.validarMensagemLoginSenhaErrada();
	    
	}


	
	@When("preencher a senha com dado invalido")
	public void preencherASenhaComDadoInvalido() {
		home.dadosSenhaErrada();
		
	    
	}
	@When("preencher o usuario corretamente")
	public void preencherOUsuarioCorretamente() {
		
	    

	    
	}
	@Then("login nao realizado com mensagem de senha incorreta")
	public void loginNaoRealizadoComMensagemDeSenhaIncorreta() {
		home.validarMensagemLoginSenhaErrada();
	    
	}


}
