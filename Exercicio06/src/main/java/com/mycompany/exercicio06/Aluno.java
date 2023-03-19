/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio06;

/**
 *
 * @author joaoc
 */
public class Aluno {
    private String nome;
    private int idade;
    private char genero;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // getters
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

    public double getNota() {
        return nota;
    }
}



