#Author: Eduardo Maia e Diego Rodrigues

@regressivos
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
Scenario: Login invalido   
    When preencher o usuario
    But nao  preencher a senha
    And clicar no botao login
    Then login não realizado com mensagem de senha obrigatoria 

 