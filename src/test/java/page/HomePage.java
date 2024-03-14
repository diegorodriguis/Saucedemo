package page;

import elementos.ElementosLogin;
import metodos.Metodos;

public class HomePage {

	ElementosLogin eleLogin = new ElementosLogin();

	public void usernamePassword(String username, String password) {
		Metodos.escrever(eleLogin.getUsername(), username);
		Metodos.escrever(eleLogin.getPassword(), password);

	}

	public void msgPasswordUsernameInvalido() {
		Metodos.validarTexto(eleLogin.getMsgUsernameInvalido(),
				"Epic sadface: Username and password do not match any user in this service");

	}

	public void msgUsernameEmBranco() {
		Metodos.validarTexto(eleLogin.getMsgUsernameEmBranco(), "Epic sadface: Username is required");
	}

	public void msgPasswordEmBranco() {
		Metodos.validarTexto(eleLogin.getMsgPasswordEmBranco(), "Epic sadface: Password is required");
	}

	public void msgUsernameBloqueado() {
		Metodos.validarTexto(eleLogin.getMsgUsernameBloqueado(), "Epic sadface: Sorry, this user has been locked out.");

	}

	public void validarUrlLogada() {
		Metodos.validarUrl("https://www.saucedemo.com/inventory.html");

	}

	public void botaoLogin() {
		Metodos.clicar(eleLogin.getBtnLogin());

	}

}
