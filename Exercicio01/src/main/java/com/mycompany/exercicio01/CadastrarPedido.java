package com.mycompany.exercicio01;
public class CadastrarPedido {
    public double valor;
    public String bebida;
    public int fichaSinuca;
    public String comida;
    public int mesa;
    
    

public void pedidoBebida(String bebida, double valor, int mesa){
    
    this.bebida = bebida;
    this.valor = valor;   
    this.mesa = mesa;
} 
public void pedidoFichaSinuca(int fichaSinuca, double valor, int mesa){
    this.fichaSinuca = fichaSinuca;
    this.valor = valor;   
    this.mesa = mesa;
} 
public void pedidoComida(String comida, double valor, int mesa){
    this.comida = comida;
    this.valor = valor;
    this.mesa = mesa;
} 

    
}


