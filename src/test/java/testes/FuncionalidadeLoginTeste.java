package testes;

import conf.IniciarTeste;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FuncionalidadeLoginTeste {
	
	@Before
	public void iniciarTeste() {
		IniciarTeste.configurarAmbiente();
	}
	
	@After
	public void finalizarTeste() {
		IniciarTeste.encerrarTeste();
	}
	
	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
	   
	}
	@When("enviar os dados de login")
	public void enviarOsDadosDeLogin() {
	    
	}
	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
	    
	}



	

}
