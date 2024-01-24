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
		metodo.escrever(elemento.getUsername(), "standard_user");
		metodo.escrever(elemento.getPassword(), "secret_sauce");
		metodo.clicar(elemento.getBtLogin());
	}

	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {

	}

}
