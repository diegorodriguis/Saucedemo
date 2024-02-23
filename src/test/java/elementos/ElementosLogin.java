
package elementos;

import org.openqa.selenium.By;

public class ElementosLogin {

	private By username = By.id("user-name");
	private By password = By.id("password");
	private By btnLogin = By.id("login-button");
	private By msgUsernameInvalido = By.xpath("//h3[@data-test='error']");
	private By msgPasswordInvalido = By.xpath("//h3[@data-test='error']");
	private By msgUsernameEmBranco = By.xpath("//h3[@data-test='error']");
	private By msgPasswordEmBranco = By.xpath("//h3[@data-test='error']");
	private By msgUsernameBloqueado = By.xpath("//h3[@data-test='error']");
			

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

	public By getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(By btnLogin) {
		this.btnLogin = btnLogin;
	}

	public By getMsgUsernameInvalido() {
		return msgUsernameInvalido;
	}

	public void setMsgUsernameInvalido(By msgUsernameInvalido) {
		this.msgUsernameInvalido = msgUsernameInvalido;
	}

	public By getMsgPasswordInvalido() {
		return msgPasswordInvalido;
	}

	public void setMsgPasswordInvalido(By msgPasswordInvalido) {
		this.msgPasswordInvalido = msgPasswordInvalido;
	}

	public By getMsgUsernameEmBranco() {
		return msgUsernameEmBranco;
	}

	public void setMsgUsernameEmBranco(By msgUsernameEmBranco) {
		this.msgUsernameEmBranco = msgUsernameEmBranco;
	}

	public By getMsgPasswordEmBranco() {
		return msgPasswordEmBranco;
	}

	public void setMsgPasswordEmBranco(By msgPasswordEmBranco) {
		this.msgPasswordEmBranco = msgPasswordEmBranco;
	}

	public By getMsgUsernameBloqueado() {
		return msgUsernameBloqueado;
	}

	public void setMsgUsernameBloqueado(By msgUsernameBloqueado) {
		this.msgUsernameBloqueado = msgUsernameBloqueado;
	}

}