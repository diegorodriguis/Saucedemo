package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class Testes {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	
	@Before
	public void setUp() {
		metodo.abrirNavegador();
	}

	@After
	public void close() {
		//metodo.fecharNavegador();

	}

	@Test
	public void logiComSucesso() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.btLogin);

	}

	@Test
	public void validarUrlLogada() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.btLogin);
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");

	}
}
