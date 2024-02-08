package page;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class HomePage {

	Elementos elemento = new Elementos();

	public void telaDeLogin(String url) {
		Executa.configurarAmbiente(url);

	}

	public void dadosDeLogin() {
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(), "secret_sauce");

	}

	public void login() {
		Metodos.clicar(elemento.getBtLogin());
	}

	public void dadosSenhaEmBranco() {
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(), "");
	}
		

	public void dadosUsuarioEmBranco() {
		Metodos.escrever(elemento.getUsername(), "");
		Metodos.escrever(elemento.getPassword(), "secret_sauce");

	}
	public void validaMensagemLoginUsuarioEmBranco() {
		Metodos.validarTexto(elemento.getMsgSenhaEmBranco(), "Epic sadface: Username is required");
	}

	public void validaMensagemLoginSenhaEmBranco() {
		Metodos.validarTexto(elemento.getMsgSenhaEmBranco(), "Epic sadface: Password is required");
	}
	
	public void validarMensagemLoginSenhaErrada() {
		Metodos.validarTexto(elemento.getMsgUsuarioSenhaErrada(), "Epic sadface: Username and password do not match any user in this service");
		
	}
	
	public void dadosUsuarioErrado() {
		Metodos.escrever(elemento.getUsername(), "teste");
		Metodos.escrever(elemento.getPassword(),"secret_sauce");
		
	}
	
	public void dadosSenhaErrada() {
		Metodos.escrever(elemento.getUsername(), "standard_user");
		Metodos.escrever(elemento.getPassword(),"teste");
		
	}
}
