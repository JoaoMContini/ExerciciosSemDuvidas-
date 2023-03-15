package com.mycompany.exercicio01;
/*Criar uma projeto para Pedido Mesa de Bar.

Criar uma Classe para Cadastrar Pedido, com 5 atributos; Desses 5 atributos pelo menos 1 deverá ser Valor; A Classe deverá conter métodos para definir cada 1 dos 5 atributos;

Na classe Principal do Solicitar o Cadastro de 5 pedidos; 

Na Classe Principal Retornar 1 Mensagem destacando o Total dos 5 pedidos;*/
public class Exercicio01 extends CadastrarPedido{
    
    public static void main(String[] args) {
        System.out.println("Boa noite, bem vindos ao 'Nosso bar' aqui temos bebidas, sinuca e comida, por gentileza, faça 5 pedidos:");
      double soma = 0;
        
        CadastrarPedido pedido1 = new CadastrarPedido();
        CadastrarPedido pedido2 = new CadastrarPedido();
        CadastrarPedido pedido3 = new CadastrarPedido();
        CadastrarPedido pedido4 = new CadastrarPedido();
        CadastrarPedido pedido5 = new CadastrarPedido();
        
            pedido1.pedidoBebida("agua", 25, 6);
            soma += pedido1.valor;
            pedido2.pedidoComida("Doritos", 7.50, 3);
            soma += (pedido2.valor * 3);
            pedido3.pedidoFichaSinuca(3, 2, 3);
            soma += pedido3.valor;
            pedido4.pedidoBebida("Gin", 75.35, 5);
            soma += pedido4.valor;
            pedido5.pedidoFichaSinuca(4, 2, 3);
            soma += (pedido5.valor * 4);
           
            System.out.println("A soma total de todos os valores é: " + soma);
    }
  
}
    
            
