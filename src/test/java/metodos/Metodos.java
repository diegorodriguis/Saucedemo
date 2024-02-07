package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import conexao.Driver;

public class Metodos extends Driver {

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public static void clicar(By elemento) {	
			driver.findElement(elemento).click();		

	}

	public static void validarTitle(By elemento, String titleEsperado) {
			String titleCapturado = driver.getTitle();
			assertEquals(titleEsperado, titleCapturado);
		

	}

	public static void validarUrl(String urlEsperada) {
			assertEquals(urlEsperada, driver.getCurrentUrl());
		
	}

	public static void validarTexto(By elemento, String textoEsperado) {
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);

		
	}

	public static void validarUrllogada(String urlEsperada) {
			assertEquals(urlEsperada, driver.getCurrentUrl());
		
	}
}
