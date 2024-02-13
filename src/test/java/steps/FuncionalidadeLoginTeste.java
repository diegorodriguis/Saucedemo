package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import runner.Executa;

public class FuncionalidadeLoginTeste {

	HomePage home = new HomePage();
	
	@After
	public void finalizarTest() {
		Executa.encerrarTeste();
	}

	// deve realizar login com sucesso
	@Given("que esteja na tela de login {string}")
	public void queEstejaNaTelaDeLogin(String url) {
		Executa.configurarAmbiente(url);
	}

	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {
		home.dadosUsername();
		home.dadosPassword();
	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		home.buttonLogin();
	}

	// nao deve fazer login senha em branco

	@When("preencher o usuario")
	public void preencherOUsuario() {
		home.dadosUsername();
	}

	@When("nao preencher a senha")
	public void naoPreencherASenha() {
		home.passwordEmBranco();
	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		home.buttonLogin();
	}

	@Then("login nao realizado com mensagem de senha obrigatoria")
	public void loginNaoRealizadoComMensagemDeSenhaObrigatoria() {
		home.validaMensagemLoginSenhaEmBranco();
	}
	
	// nao deve fazer login usuario em branco

	@When("nao preencher o usuario")
	public void naoPreencherOUsuario() {
		home.usernameEmBranco();
	}

	@When("preencher a senha")
	public void preencherASenha() {
		home.dadosPassword();
	}

	@Then("login nao realizado com mensagem de usuario obrigatoria")
	public void loginNaoRealizadoComMensagemDeUsuarioObrigatoria() {
		home.validaMensagemLoginUsuarioEmBranco();
	}
	
	//nao deve fazer login usuario invalido
	
	
	@When("preencher o usuario com dado invalido")
	public void preencherOUsuarioComDadoInvalido() {
		home.usernameErrado();
	    
	}
	@When("preencher a senha corretamente")
	public void preencherASenhaCorretamente() {
		home.dadosPassword();
	    
	
	    
	}
	@Then("login nao realizado com mensagem de usuario incorreto")
	public void loginNaoRealizadoComMensagemDeUsuarioIncorreto() {
		home.validarMensagemLoginSenhaErrada();
	    
	}

	//nao deve fazer login senha invalida

	
	@When("preencher a senha com dado invalido")
	public void preencherASenhaComDadoInvalido() {
		home.passwordErrado();
		
	    
	}
	@When("preencher o usuario corretamente")
	public void preencherOUsuarioCorretamente() {
		home.dadosUsername();
		
	    

	    
	}
	@Then("login nao realizado com mensagem de senha incorreta")
	public void loginNaoRealizadoComMensagemDeSenhaIncorreta() {
		home.validarMensagemLoginSenhaErrada();
	    
	}
	
	////nao deve fazer login usuario bloqueado

	@When("preencher o usuario bloqueado")
	public void preencherOUsuarioBloqueado() {
		home.usernameBloqueado();
	    
	}
	@When("preencher a senha valida")
	public void preencherASenhaValida() {
		home.dadosPassword();
		
	    
	}
	@Then("login nao realizado com mensagem de usuario bloqueado")
	public void loginNaoRealizadoComMensagemDeUsuarioBloqueado() {
		home.validarMensagemLoginUsuarioBloqueado();
	    
	}






}
