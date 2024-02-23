package page;

import elementos.ElementosLogin;
import metodos.Metodos;

public class HomePage {

	ElementosLogin eleLogin = new ElementosLogin();

	public void usernamePassword () {
		Metodos.escrever(eleLogin.getUsername(), "standard_user");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
		
		  
		
	}
	
	public void usernameInvalido() {
		Metodos.escrever(eleLogin.getUsername(), "invalido");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	public void msgPasswordUsernameInvalido() {
		Metodos.validarTexto(eleLogin.getMsgUsernameInvalido(), "Epic sadface: Username and password do not match any user in this service");
		
		
	}
	
	public void passwordInvalido() {
		Metodos.escrever(eleLogin.getUsername(), "standard_user");
		Metodos.escrever(eleLogin.getPassword(), "invalido");
	}
	
	
	public void usernameEmBranco() {
		Metodos.escrever(eleLogin.getUsername(), "");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	public void msgUsernameEmBranco() {
		Metodos.validarTexto(eleLogin.getMsgUsernameEmBranco(), "Epic sadface: Username is required");
	}                                                          
	
	public void passwordEmBranco() {
		Metodos.escrever(eleLogin.getUsername(), "standard_user");
		Metodos.escrever(eleLogin.getPassword(), "");
	}
	
	public void msgPasswordEmBranco() {
		Metodos.validarTexto(eleLogin.getMsgPasswordEmBranco(), "Epic sadface: Password is required");
	}
	
	public void usernameEpasswordEmBranco() {
		Metodos.escrever(eleLogin.getUsername(), "");
		Metodos.escrever(eleLogin.getPassword(), "");
		
	}
	public void usernameBloqueado() {
		Metodos.escrever(eleLogin.getUsername(), "locked_out_user");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	
	public void msgUsernameBloqueado() {
		Metodos.validarTexto(eleLogin.getMsgUsernameBloqueado(), "Epic sadface: Sorry, this user has been locked out.");
	
	}
	public void usernameComProblema() {
		Metodos.escrever(eleLogin.getUsername(), "problem_user");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	public void validarUrlLogada() {
		Metodos.validarUrl("https://www.saucedemo.com/inventory.html");
		
	}
	
	
	public void usernameComFalha() {
		Metodos.escrever(eleLogin.getUsername(), "performance_glitch_user");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	public void validarUrlLogadaComFalha() {
		Metodos.validarUrl("https://www.saucedemo.com/inventory.html");
	
	}
	
	public void usernameComErro() {
		Metodos.escrever(eleLogin.getUsername(), "error_user");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	public void validarUrlLogadaComErro() {
		Metodos.validarUrl("https://www.saucedemo.com/inventory.html");
	
	}
	
	public void usernameComErroVisual() {
		Metodos.escrever(eleLogin.getUsername(), "visual_user");
		Metodos.escrever(eleLogin.getPassword(), "secret_sauce");
	}
	
	public void validarUrlLogadaComErroVisual() {
		Metodos.validarUrl("https://www.saucedemo.com/inventory.html");
	
	}
	public void botaoLogin() {
		Metodos.clicar(eleLogin.getBtnLogin());
			
		}	
	
		
		
		
		
	}


