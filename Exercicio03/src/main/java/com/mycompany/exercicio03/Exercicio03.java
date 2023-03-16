/*
 Criar um projeto para Campeonato de Futebol. 

Criar uma classe para definir Jogador com no mínimo 5 atributos privados e no mínimo 3 métodos e além dos 3 um método construtor para Cadastrar os 5 atributos que não podem ficar acessível fora da classe; 

Criar uma Classe para Time de Futebol com no mínimo 5 atributos 1 dos atributos deverá ser o jogador do time que será referência da classe jogador, ou seja 1 time deverá ter pelo menos 1 jogador;

Na classe principal solicitar o Cadastro de 5 jogadores utilizando apenas a o método construtor da classe Jogador;

Na classe principal solicitar o Cadastro de 2 times utilizando apenas o método construtor da classe Time e ao selecionar o jogador deverá ser validado se o jogador está cadastrado;

Retornar uma mensagem do conforme exemplo a seguir: "Jogo de hoje é Time1 vs Time2" Destacando os dados dos dois times Cadatrados;
 */

package com.mycompany.exercicio03;
public class Exercicio03 extends Jogador {

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();
        Jogador j4 = new Jogador();
        Jogador j5 = new Jogador();
        
        j1.construtorJogador("João", "Corinthians", "Titular", 1.75, 86);
        j2.construtorJogador("Marcos", "Atlético", "Reserva", 1.70, 96);
        j3.construtorJogador("Mateus", "Flamengo", "Titular", 1.85, 106);
        j4.construtorJogador("Edu", "Inter", "Reserva", 1.65, 56);
        j5.construtorJogador("Pedro", "Gremio", "Titular", 1.75, 96);
    
        TimeFutebol corinthians = new TimeFutebol();
        TimeFutebol flamengo = new TimeFutebol();
        
        corinthians.cadastrarTime("Corinthians", j1, 10, 2, "Tite");
        flamengo.cadastrarTime("Flamengo", j3, 20, 5, "Lete");
    
        System.out.println("Jogo de hoje é " + corinthians.nomeTime + " vs " + flamengo.nomeTime);
        corinthians.imprimirDadosTime();
        flamengo.imprimirDadosTime();
    }
}
