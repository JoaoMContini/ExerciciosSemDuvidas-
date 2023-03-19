package com.mycompany.exercicio07;
public class Paciente {
    private String nome;
    private int idade;
    private char genero;
    private int matricula;
    private Sintoma sintoma;

    public Paciente(String nome, int idade, char genero, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.matricula = matricula;
    }

    public void setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getGenero() {
        return genero;
    }

    public int getMatricula() {
        return matricula;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }
}
