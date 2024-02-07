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
    But nao  preencher a senha
    And clicar no botao login
    Then login nao realizado com mensagem de senha obrigatoria 
    

Scenario: Login invalido usuario em branco
When preencher o usuario
    But nao  preencher o usuario
    And clicar no botao login
    Then login nao realizado com mensagem de usuario obrigatoria   
  

 