package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class FuncionalidadeLoginTeste {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que esteja na tela de login {string}")
	public void queEstejaNaTelaDeLogin(String url) {
		Executa.configurarAmbiente(url);
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(), "secret_sauce");
		Metodos.clicar(elemento.getBtLogin());
	}

	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {

	}

}
