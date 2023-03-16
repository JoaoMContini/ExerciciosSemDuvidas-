package com.mycompany.exercicio05;
public class Advogado {
    public String nome;
    public String registroOAB;
    private String especialidade;
    private String telefone;
    private String email;
    private String endereco;
    private String formacao;
    private static int codigo = 1;
    private int codigoAdvogado;

    public void Advogado(String nome, String registroOAB) {
        this.nome = nome;
        this.registroOAB = registroOAB;
        this.codigoAdvogado = codigo;
        codigo++;
    }
    public void preencherEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void preencherTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void preencherEmail(String email) {
        this.email = email;
    }
    public void preencherEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void preencherFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getFormacao() {
        return formacao;
    }
    public int getCodigoAdvogado() {
        return codigoAdvogado;
    }
    public void imprimirDadosAdv(){
    System.out.println("Nome: " + nome);
    System.out.println("Registro OAB: " + registroOAB);
    System.out.println("Especialidade: " + especialidade);
    System.out.println("Telefone: " + telefone);
    System.out.println("Email: " + email);
    System.out.println("Endereco: " + endereco);
    System.out.println("Formacao: " + formacao);
    System.out.println("\n");
}
}

