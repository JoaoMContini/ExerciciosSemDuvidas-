package com.mycompany.exercicio04;

public class Cerveja {
    public String nome;
    public double teorAlcolico;
    public double tamanho;
    public int registro ;
    private int codigo;
    private String ingredienteSecreto;
    
    public void construtorIngredienteSecreto(String ingredienteSecreto){
        this.ingredienteSecreto = ingredienteSecreto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTeorAlcolico(double teorAlcolico) {
        this.teorAlcolico = teorAlcolico;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    public void imprimirDadosCerveja(){
    System.out.println("Nome: " + nome);
    System.out.println("Teor Alcólico: " + teorAlcolico);
    System.out.println("Tamanho: " + tamanho);
    System.out.println("Registro: " + registro);
    System.out.println("\n");
}
    
    
    public int getCodigo(){
        return codigo;
}
    
    
}
