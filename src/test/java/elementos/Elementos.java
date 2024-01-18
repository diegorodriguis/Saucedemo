
package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By username = By.id("user-name");
	public By password = By.id("password");
	public By btLogin = By.id("login-button");
	public By validacaoTilte =  By.xpath("//title[contains(text(), 'Swag Labs')]");

}
