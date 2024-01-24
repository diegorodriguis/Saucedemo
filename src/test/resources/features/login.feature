#Author: 

@regressivos
Feature: Efetuar login no site saucedemo
 Como usuario do site saucedemo
 Quero informar dados de acesso
 Para acessar a conta

@positivo
  Scenario: Login com sucesso
    Given que esteja na tela de login "https://www.saucedemo.com"
    When enviar os dados de login
    Then login realizado com sucesso
    

 