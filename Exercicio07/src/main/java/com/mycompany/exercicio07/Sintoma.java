package com.mycompany.exercicio07;
public class Sintoma {
    public String nome;
    public String descricao;
    public int intensidade;
    public boolean ativo;

    public Sintoma(String nome, String descricao, int intensidade, boolean ativo) {
        this.nome = nome;
        this.descricao = descricao;
        this.intensidade = intensidade;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }
}
