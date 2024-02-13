@RegressivoProdutoCarrinho
Feature: Carrinho de compras
   Como usuario do site saucedemo
  Quero colocar um produto no carrinho
   Para efetuar uma compra

Background: Configuracao inicial
     Given que esteja na tela dos produtos "https://www.saucedemo.com/inventory.html"

Scenario: Escolher produto com sucesso
      When escolher um produto clicando em adicionar ao carrinho
      Then produto no carrinho com sucesso
 

