package page;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class HomePage {

	Elementos elemento = new Elementos();

	public void telaDeLogin(String url) {
		Executa.configurarAmbiente(url);

	}

	public void dadosUsername() {
		Metodos.escrever(elemento.getUsername(), "standard_user");
		

	}
	
	public void dadosPassword() {		
		Metodos.escrever(elemento.getPassword(), "secret_sauce");
		
	}

	public void buttonLogin() {
		Metodos.clicar(elemento.getBtLogin());
	}

	public void passwordEmBranco() {
		Metodos.escrever(elemento.getPassword(), "");
	}
		

	public void usernameEmBranco() {
		Metodos.escrever(elemento.getUsername(), "");
		

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
	
	public void usernameErrado() {
		Metodos.escrever(elemento.getUsername(), "teste");
		
		
	}
	
	public void passwordErrado() {	
		Metodos.escrever(elemento.getPassword(),"teste");
		
	}
	public void usernameBloqueado() {
		Metodos.escrever(elemento.getUsername(), "locked_out_user");
		
	}
	
	public void validarMensagemLoginUsuarioBloqueado() {
		Metodos.validarTexto(elemento.getMsgUsuarioBloqueado(), "Epic sadface: Sorry, this user has been locked out.");
		
	}
}
