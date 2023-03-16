package com.mycompany.exercicio03;

public class Jogador {

    private String nome;
    private String time;
    private String titularReserva;
    private double altura;
    private double peso;

    public void removerJogador(String nome, String time, String titularReserva, double altura, double peso) {
        this.nome = null;
        this.time = null;
        this.titularReserva = null;
        this.altura = 0;
        this.peso = 0;
    }

    public void editarJogador(String nome, String time, String titularReserva, double altura, double peso) {
        this.nome = nome;
        this.time = time;
        this.titularReserva = titularReserva;
        this.altura = altura;
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.println("nome: " + nome);
        System.out.println("time: " + time);
        System.out.println("titularReserva: " + titularReserva);
        System.out.println("altura: " + altura);
        System.out.println("peso: " + peso);
        System.out.println("\n");
    }

    public void construtorJogador(String nome, String time, String titularReserva, double altura, double peso) {
        this.nome = nome;
        this.time = time;
        this.titularReserva = titularReserva;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }

}
