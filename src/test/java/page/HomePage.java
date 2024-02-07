package page;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class HomePage {

	
	Elementos elemento = new Elementos();

	public void telaDeLogin(String url) {
		Executa.configurarAmbiente(url);

	}

	public void dadosDeLogin(String dados) {
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(), "secret_sauce");
		Metodos.clicar(elemento.getBtLogin());
		
	}
	
	public void login() {	
		Metodos.clicar(elemento.getBtLogin());
		Executa.encerrarTeste();
}
	
	public void dadosSenhaEmBranco(String dados) {		
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(), "");
		Metodos.clicar(elemento.getBtLogin());
		Metodos.validarTexto(elemento.getMsgSenhaEmBranco(), "Epic sadface: Password is required");
        Executa.encerrarTeste();	
	}
	
	public void dadosUsuarioEmBranco(String dados) {		
		Metodos.escrever(elemento.getUsername(), "");
		Metodos.escrever(elemento.getPassword(), "secret_sauce");
		Metodos.clicar(elemento.getBtLogin());
		Metodos.validarTexto(elemento.getMsgSenhaEmBranco(), "Epic sadface: Username is required");
        Executa.encerrarTeste();	
	
}}
