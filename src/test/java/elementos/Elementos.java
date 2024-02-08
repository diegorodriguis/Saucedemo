
package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By username = By.id("user-name");
	private By password = By.id("password");
	private By btLogin = By.id("login-button");
	private By validacaoTitle = By.xpath("//title[contains(text(), 'Swag Labs')]");
	private By validacaoMsg = By.xpath("//button[@class='error-button']");
	private By msgSenhaEmBranco = By.xpath("//h3[@data-test='error']");
	private By msgUsuarioEmBranco = By.xpath("//h3[@data-test='error']");
	private By msgUsuarioSenhaErrada = By.xpath("//h3[@data-test='error']");
			

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

	public By getMsgSenhaEmBranco() {
		return msgSenhaEmBranco;
	}

	public void setMsgSenhaEmBranco(By msgSenhaEmBranco) {
		this.msgSenhaEmBranco = msgSenhaEmBranco;
	}

	public By getMsgUsuarioEmBranco() {
		return msgUsuarioEmBranco;
	}
	public void setMsgUsuarioEmBranco(By msgUsuarioEmBranco) {
		this.msgUsuarioEmBranco = msgUsuarioEmBranco;
}

	public By getMsgUsuarioSenhaErrada() {
		return msgUsuarioSenhaErrada;
	}

	public void setMsgUsuarioSenhaErrada(By msgUsuarioSenhaErrada) {
		this.msgUsuarioSenhaErrada = msgUsuarioSenhaErrada;
	}}
