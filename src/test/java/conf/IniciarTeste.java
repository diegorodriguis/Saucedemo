package conf;

import org.openqa.selenium.chrome.ChromeDriver;

import conexao.Driver;

public class IniciarTeste extends Driver{
	
	static String ambiente = "https://www.saucedemo.com";
	
	public static void configurarAmbiente() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ambiente);
		
	}
	
	public static void encerrarTeste() {
		driver.quit();
	}

	
}
