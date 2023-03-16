/*
 Criar um projeto para Cadastrar Bicicletas.

Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados; criar 2 métodos para cadastrar os atributos privados; Criar um construtor para atribuir 2 atributos; 

Na Classes principal Cadastrar no mínimo 4 Bicicletas;

Na Classe principal Mostrar 4 Mensagens destacando os 7 atributos das 2 primeiras bicicletas cadastradas;
 */

package com.mycompany.exercicio02;
public class Exercicio02 extends Bicicleta {

    public static void main(String[] args) {
    Bicicleta bike1 = new Bicicleta();
    Bicicleta bike2 = new Bicicleta();
    Bicicleta bike3 = new Bicicleta();
    Bicicleta bike4 = new Bicicleta();
    
    bike1.adicionarEstoque(2);
    bike1.cadastrarFornecedor("Speed");
    bike1.construtorBicicleta(10, 3, 15, 150, 35);
    
    bike2.adicionarEstoque(12);
    bike2.cadastrarFornecedor("Caloi");
    bike2.construtorBicicleta(9, 5, 12, 15230, 3523);
    
    bike3.adicionarEstoque(22);
    bike3.cadastrarFornecedor("Techno");
    bike3.construtorBicicleta(10, 34, 17, 15000, 3564);
    
    bike4.adicionarEstoque(42);
    bike4.cadastrarFornecedor("Pasto");
    bike4.construtorBicicleta(10, 32, 15, 1250, 353);
    
    
    bike1.mostrarDados();
    bike2.mostrarDados();
    bike3.mostrarDados();
    bike4.mostrarDados();
    
    }

    
 
}
