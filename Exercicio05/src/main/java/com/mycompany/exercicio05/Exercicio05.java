/*

*/

package com.mycompany.exercicio05;
public class Exercicio05 {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado();
        Advogado adv2 = new Advogado();
        Advogado adv3 = new Advogado();
        Advogado adv4 = new Advogado();
        Advogado adv5 = new Advogado();
        
        adv1.nome = "João";
        adv1.registroOAB = "1";
        adv1.preencherEmail("joao.teste@hotmail.com");
        adv1.preencherEndereco("123");
        adv1.preencherEspecialidade("juridica");
        adv1.preencherFormacao("advocacia");
        adv1.preencherTelefone("123123");
       
        adv2.nome = "Marcos";
        adv2.registroOAB = "2";
        adv2.preencherEmail("marcos.teste@hotmail.com");
        adv2.preencherEndereco("123");
        adv2.preencherEspecialidade("juridica");
        adv2.preencherFormacao("advocacia");
        adv2.preencherTelefone("1223123");
        
        adv3.nome = "Neide";
        adv3.registroOAB = "3";
        adv3.preencherEmail("neide.teste@hotmail.com");
        adv3.preencherEndereco("123");
        adv3.preencherEspecialidade("juridica");
        adv3.preencherFormacao("advocacia");
        adv3.preencherTelefone("123123");
        
        adv4.nome = "Jullio";
        adv4.registroOAB = "4";
        adv4.preencherEmail("joao.teste@hotmail.com");
        adv4.preencherEndereco("123");
        adv4.preencherEspecialidade("juridica");
        adv4.preencherFormacao("advocacia");
        adv4.preencherTelefone("123123");
        
        adv5.nome = "Mateus";
        adv5.registroOAB = "5";
        adv5.preencherEmail("joao.teste@hotmail.com");
        adv5.preencherEndereco("123");
        adv5.preencherEspecialidade("juridica");
        adv5.preencherFormacao("advocacia");
        adv5.preencherTelefone("123123");
        
        adv3.imprimirDadosAdv();
        adv4.imprimirDadosAdv();
        adv5.imprimirDadosAdv();
        
    }
    
    }