/*
 Criar um projeto para Cadastrar Cerveja.

Criar uma Classe Cerveja com 4 Atributos Públicos e 2 Atributos Privados; A Classe deverá conter um construtor preenchendo 1 atributo privado e o outro atributo privado deverá ser chamado de Código e esse deverá ser incremental; Deverá conter 1 Método para preencher cada atributo público; A Classe também deverá conter 1 método para retornar o valor do atributo Código;

Na Classe Principal solicitar o Cadastro de 5 Cervejas preenchendo todos atributos;

Na Classe Principal retornar todas as Cervejas cadastradas; 
 */

package com.mycompany.exercicio04;
public class Exercicio04 {

    public static void main(String[] args) {
        Cerveja c1 = new Cerveja();
        Cerveja c2 = new Cerveja();
        Cerveja c3 = new Cerveja();
        Cerveja c4 = new Cerveja();
        Cerveja c5 = new Cerveja();
        
        c1.nome = "Contini Pilsen";
        c1.registro = 1;
        c1.tamanho = 355;
        c1.teorAlcolico = 5;
    
        c2.nome = "Contini Puro Malte";
        c2.registro = 2;
        c2.tamanho = 355;
        c2.teorAlcolico = 7;
             
        c3.nome = "Contini IPA";
        c3.registro = 3;
        c3.tamanho = 355;
        c3.teorAlcolico = 8;
    
        c4.nome = "Contini Lager";
        c4.registro = 4;
        c4.tamanho = 355;
        c4.teorAlcolico = 5;

        c5.nome = "Contini VERA IPA";
        c5.registro = 5;
        c5.tamanho = 355;
        c5.teorAlcolico = 12;
    
         System.out.println("As cervejas cadastradas foram: \n");
         c1.imprimirDadosCerveja();
         c2.imprimirDadosCerveja();
         c3.imprimirDadosCerveja();
         c4.imprimirDadosCerveja();
         c5.imprimirDadosCerveja();
}
    
}
