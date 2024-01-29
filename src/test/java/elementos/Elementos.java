
package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By username = By.id("user-name");
	private By password = By.id("password");
	private By btLogin = By.id("login-button");
	private By validacaoTitle = By.xpath("//title[contains(text(), 'Swag Labs')]");
	private By validacaoMsg = By.xpath("//button[@class='error-button']");

	public By getUsername() {
		return username;
	}

	public void setUsername(By username) {
		this.username = username;
	}

	public By getPassword() {
		return password;
	}

	public void setPassword(By password) {
		this.password = password;
	}

	public By getBtLogin() {
		return btLogin;
	}

	public void setBtLogin(By btLogin) {
		this.btLogin = btLogin;
	}

	public By getValidacaoTitle() {
		return validacaoTitle;
	}

	public void setValidacaoTilte(By validacaoTitle) {
		this.validacaoTitle = validacaoTitle;
	}

    public By getValidacaoMsg() {
    	return validacaoMsg;
    	
    }
    
    public void setValidacaoMsg(By validacaoMsg) {
    	this.validacaoMsg = validacaoMsg;
    }
}
