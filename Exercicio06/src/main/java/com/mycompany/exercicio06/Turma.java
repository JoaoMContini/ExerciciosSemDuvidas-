package com.mycompany.exercicio06;
public class Turma {
    private String nome;
    private int codigo;
    private Aluno aluno;

    public Turma(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }
 }
