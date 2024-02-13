#Author: Eduardo Maia e Diego Rodrigues

@regressivoLogin
Feature: Efetuar login no site saucedemo
 Como usuario do site saucedemo
 Quero informar dados de acesso
 Para acessar a conta
 
    Background: Configuração inicial
    Given que esteja na tela de login "https://www.saucedemo.com"
    
@positivo
  Scenario: Login com sucesso
    When enviar os dados de login
    Then login realizado com sucesso
   
@negativo1
Scenario: Login invalido senha em branco   
    When preencher o usuario
    But nao preencher a senha
    And clicar no botao login
    Then login nao realizado com mensagem de senha obrigatoria 
     
@negativo2
Scenario: Login invalido usuario em branco
    When nao preencher o usuario
    But preencher a senha
    And clicar no botao login
    Then login nao realizado com mensagem de usuario obrigatoria  
    
@negativo3    
Scenario: Login usuario com usuario invalido
    When preencher o usuario com dado invalido
    But preencher a senha corretamente
    And clicar no botao login
    Then login nao realizado com mensagem de usuario incorreto 
    
 @negativo4   
Scenario: Login usuario com senha invalida
    When preencher a senha com dado invalido
    But preencher o usuario corretamente
    And clicar no botao login
    Then login nao realizado com mensagem de senha incorreta 
    
 @negativo5
 Scenario: Login usuario com usuario bloqueado
    When preencher o usuario bloqueado
    But preencher a senha valida
    And clicar no botao login
    Then login nao realizado com mensagem de usuario bloqueado 
   
     

 