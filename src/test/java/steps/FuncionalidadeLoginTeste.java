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
		home.dadosSenhaEmBranco();

	}

	@When("nao  preencher a senha")
	public void naoPreencherASenha() {
		home.dadosSenhaEmBranco();

	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		home.dadosSenhaEmBranco();

	}

	@Then("login não realizado com mensagem de senha obrigatoria")
	public void loginNãoRealizadoComMensagemDeSenhaObrigatoria() {
		home.dadosSenhaEmBranco();

	}

}
