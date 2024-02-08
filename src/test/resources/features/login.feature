#Author: Eduardo Maia e Diego Rodrigues

@regressivo
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
   
@negativo
Scenario: Login invalido senha em branco   
    When preencher o usuario
    But nao preencher a senha
    And clicar no botao login
    Then login nao realizado com mensagem de senha obrigatoria 
     
@negativo
Scenario: Login invalido usuario em branco
    When nao preencher o usuario
    But preencher a senha
    And clicar no botao login
    Then login nao realizado com mensagem de usuario obrigatoria  
    
@negativo    
Scenario: Login usuario com usuario invalido
    When preencher o usuario com dado invalido
    But preencher a senha corretamente
    And clicar no botao login
    Then login nao realizado com mensagem de usuario incorreto 
    
 @negativo   
Scenario: Login usuario com senha invalida
    When preencher a senha com dado invalido
    But preencher o usuario corretamente
    And clicar no botao login
    Then login nao realizado com mensagem de senha incorreta 
     

 