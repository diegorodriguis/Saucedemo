package page;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {
	
	Metodos metodos = new Metodos();
	
	public void urlPaginaLogin(String Url) {
		Metodos.validarUrl(Url);
		
	}
	
	
	public void dadosLogin(String usuario, String senha) {		
		Metodos.escrever(Elementos.username, usuario);
		Metodos.escrever(Elementos.password,senha);
		Metodos.clicar(Elementos.btLogin);
	}
	
	public void urlLogada(String UrlLoagdo) {
		Metodos.validarUrllogada(UrlLoagdo);
		
	
	

}}
