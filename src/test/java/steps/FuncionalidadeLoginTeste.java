package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import runner.Executa;

public class FuncionalidadeLoginTeste {

	String username = "standard_user";
	String password = "secret_sauce";
	String usernameBloqueado = "locked_out_user";
	String usernameComProblema = "problem_user";
	String usernameComFalha = "performance_glitch_user";
	String usernameComErro = "error_user";
	String usernameComErroVisual = "visual_user";
	
	HomePage page = new HomePage();
	
	@After
	public void depoisDoTest() {
		Executa.encerrarTest();
	}

	@Given("que esteja na tela de login {string}")
	public void queEstejaNaTelaDeLogin(String url) {
		Executa.configurarAmbiente(url);   
	}
		

	@When("informar dados validos de login")
	public void informarDadosValidosDeLogin() {
		page.usernamePassword(username, password);

	}

	@When("clicar em login apos informar os dados validos")
	public void clicarEmLoginAposInformarOsDadosValidos() {
		page.botaoLogin();

	}

	@Then("login efetuado com sucesso direcionando para tela de usuário logado")
	public void loginEfetuadoComSucessoDirecionandoParaTelaDeUsuárioLogado() {
		page.validarUrlLogada();

	}

	@When("informar username invalido")
	public void informarUsernameInvalido() {
		page.usernamePassword("invalido", password);

	}

	@When("clicar em login mesmo com username invalido")
	public void clicarEmLoginMesmoComUsernameInvalido() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar username valido")
	public void apareceMenssagemSolicitandoParaInformarUsernameValido() {
		page.msgPasswordUsernameInvalido();

	}

	@When("informar password invalido")
	public void informarPasswordInvalido() {
		page.usernamePassword(username, "invalido");

	}

	@When("clicar em login mesmo com password invalido")
	public void clicarEmLoginMesmoComPasswordInvalido() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar password valido")
	public void apareceMenssagemSolicitandoParaInformarPasswordValido() {
		page.msgPasswordUsernameInvalido();

	}

	@When("deixar o username em branco")
	public void deixarOUsernameEmBranco() {
		page.usernamePassword("", password);

	}

	@When("clicar em login mesmo com o username em branco")
	public void clicarEmLoginMesmoComOUsernameEmBranco() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar username")
	public void apareceMenssagemSolicitandoParaInformarUsername() {
		page.msgUsernameEmBranco();

	}

	@When("deixar o password em branco")
	public void deixarOPasswordEmBranco() {
		page.usernamePassword(username, "");

	}

	@When("clicar em login mesmo com o password em branco")
	public void clicarEmLoginMesmoComOPasswordEmBranco() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar password")
	public void apareceMenssagemSolicitandoParaInformarPassword() {
		page.msgPasswordEmBranco();

	}

	@When("deixar o username e password em branco") //verificar no teste
	public void deixarOUsernameEPasswordEmBranco() {

	}

	@When("clicar em login mesmo com username e password em branco")
	public void clicarEmLoginMesmoComUsernameEPassordEmBranco() {
		page.botaoLogin();

	}

	@Then("aparece menssagem solicitando para informar username e password")
	public void apareceMenssagemSolicitandoParaInformarUsernameEPassword() {
		page.msgUsernameEmBranco();

	}
	

	@When("inforamr os dados de username bloqueado")
	public void inforamrODadosDeUsernameBloqueado() {
		page.usernamePassword(usernameBloqueado, password);
	    
	}
	@When("clicar em login mesmo informando usuario bloqueado")
	public void clicarEmLoginMesmoInformandoUsuarioBloqueado() {
		page.botaoLogin();
	    
	}
	@Then("aparece mensagem solicitando para informar username valido")
	public void apareceMensagemSolicitandoParaInformarUsernameValido() {
		page.msgUsernameBloqueado();
	    
	}
	@When("informar os dados de username com problema")
	public void informarOsDadosDeUsernameComProblema() {
		page.usernamePassword(usernameComProblema, password);
	   
	}
	@When("clicar em login mesmo informando usuario com problema")
	public void clicarEmLoginMesmoInformandoUsuarioComProblema() {
		page.botaoLogin();
	   
	}
	
	@Then("direciona para pagina com problema")
	public void direcionaParaPaginaComProblema() {
		page.validarUrlLogada();
	    
	}
		
	@When("informar os dados de username com falha")
	public void informarOsDadosDeUsernameComFalha() {
		page.usernamePassword(usernameComFalha, password);

	  
	}
	@When("clicar em login mesmo informando usuario com falha")
	public void clicarEmLoginMesmoInformandoUsuarioComFalha() {
		page.botaoLogin();
	    
	}
	@Then("direciona para pagina com falha")
	public void direcionaParaPaginaComFalha() {
		page.validarUrlLogada();
	   
	}	

	@When("informar os dados de username com erro")
	public void informarOsDadosDeUsernameComErro() {
		page.usernamePassword(usernameComErro, password);
	    
	}
	@When("clicar em login mesmo informando usuario com erro")
	public void clicarEmLoginMesmoInformandoUsuarioComErro() {
		page.botaoLogin();
	    
	}
	@Then("direciona para pagina com erro")
	public void direcinaParaPaginaComErro() {
		page.validarUrlLogada();
	    
	}	
	
	@When("informar os dados de username e password")
	public void informarOsDadosDeUsernameEPassword() {
		page.usernamePassword(usernameComErroVisual, password);

	    
	}
	@When("clicar em login para seguir")
	public void clicarEmLoginParaSeguir() {
		page.botaoLogin();
	    
	}
	@Then("direciona para pagina com erro na imagem")
	public void direcionaParaPaginaComErroNaImagem() {
		page.validarUrlLogada();
	    
	}
}









