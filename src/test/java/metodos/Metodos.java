package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import conexao.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends Driver {

	public void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com/");
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarTitle(By elemento, String titleEsperado) {
		String titleCapturado = driver.getTitle();
		assertEquals(titleEsperado, titleCapturado);

	}

	public void validarUrl(String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlEsperada, urlCapturada);

	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);

	}
}
