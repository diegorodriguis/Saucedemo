package page;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class HomePage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void telaDeLogin(String url) {
		Executa.configurarAmbiente(url);

	}

	public void dadosDeLogin(String dados) {
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(), "secret_sauce");
		Metodos.clicar(elemento.getBtLogin());
	}
	
	public void loginComSucesso() {	
		Metodos.clicar(elemento.getBtLogin());
		Executa.encerrarTeste();
}
}
