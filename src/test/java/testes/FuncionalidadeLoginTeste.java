package testes;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegadores.IniciarTeste;
import page.HomePage;

public class FuncionalidadeLoginTeste {
	
	HomePage home = new HomePage();

	@Before
	public void iniciarTeste() {
		IniciarTeste.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {
		// IniciarTeste.encerrarTeste();
	}

	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
	home.urlPaginaLogin("https://www.saucedemo.com/");

	}

	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {
	home.dadosLogin("standard_user", "secret_sauce");

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		home.urlLogada("https://www.saucedemo.com/inventory.html");

	}

}
