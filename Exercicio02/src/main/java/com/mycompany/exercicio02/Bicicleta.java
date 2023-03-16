package com.mycompany.exercicio02;
public class Bicicleta {
    public int tamanhoAro;
    public int qtdRaios;
    public int tamanhoQuadro;
    private double custo;
    private double margemLucro;
    private String fornecedor;
    private int estoque;

public void cadastrarFornecedor(String fornecedor){
    this.fornecedor = fornecedor;
}
public void adicionarEstoque(int estoque){
    this.estoque = estoque;
}
public void construtorBicicleta(int aro, int raios, int quadro, double custo, double lucro){
    tamanhoAro = aro;
    qtdRaios = raios;
    tamanhoQuadro = quadro;
    this.custo = custo;
    this.margemLucro = lucro;
    
}
 public void mostrarDados() {
        System.out.println("custo: " + custo);
        System.out.println("qtd Raios: " + qtdRaios);
        System.out.println("Tamanho do aro: " + tamanhoAro);
        System.out.println("Margem Lucro: " + margemLucro);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Estoque: " + estoque);
        System.out.println("\n");
    }
}
