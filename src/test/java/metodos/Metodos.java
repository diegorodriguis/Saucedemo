package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import conexao.Driver;

public class Metodos extends Driver {

	public static void escrever(By elemento, String texto) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			
			
			System.out.println("*******Causa do erro*************" + e.getCause());
			System.out.println("*******Mensagem do erro*****" + e.getMessage());

		}

	}

	public static void clicar(By elemento) {

		try {
			driver.findElement(elemento).click();
			
		} catch (Exception e) {
			
			System.out.println("*******Causa do erro**********" + e.getCause());
			System.out.println("*******Mensagem do erro*******" + e.getMessage());

		}

	}

	public static void validarTitle(By elemento, String titleEsperado) {
		try {
			String titleCapturado = driver.getTitle();
			assertEquals(titleEsperado, titleCapturado);
			
		} catch (Exception e) {
		
			System.out.println("******Causa do erro********" + e.getCause());
			System.out.println("******Mensagem do erro********" + e.getMessage());

		}

	}

	public static void validarUrl(String urlEsperada) {

		try {
			assertEquals(urlEsperada, driver.getCurrentUrl());
			
		} catch (Exception e) {
		
			System.out.println("*******Causa do erro********" + e.getCause());
			System.out.println("*******Mensagem do erro********" + e.getMessage());

		}
	}

	public static void validarTexto(By elemento, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);

		} catch (Exception e) {
			
			System.out.println("***********Causa do erro************"+e.getCause());
			System.out.println("***********Mensagem do erro************"+e.getMessage());

		}

	}
	
	public static void validarUrllogada(String urlEsperada) {

		try {
			assertEquals(urlEsperada, driver.getCurrentUrl());
			
		} catch (Exception e) {
		
			System.out.println("*******Causa do erro********" + e.getCause());
			System.out.println("*******Mensagem do erro********" + e.getMessage());

		}
	}
}
