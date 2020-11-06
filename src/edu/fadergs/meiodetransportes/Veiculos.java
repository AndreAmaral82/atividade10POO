/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fadergs.meiodetransportes;

import javax.swing.JOptionPane;

/**
 *
 * @author claudio.silva
 */
public class Veiculos {

    protected String marca;
    protected String modelo;
    protected int qtdRodas;
    protected int velocidade = 0;
    
    public Veiculos(){
        
    }
   
    
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
     public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getqtdRodas(){
        return qtdRodas;
    }
    public void setqtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
   
     public int getvelocidade(){
        return velocidade;
    }
    public void setvelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public void acelerar(int valor){
        this.velocidade += valor;
    }
    
    public void frear(int valor){
        this.velocidade -= valor;
    }
     
    public void imprimirInformacoes(){
        JOptionPane.showMessageDialog(null,
                "A marca é: " + this.marca +
                "\nO modelo é: " + this.modelo +
                "\nA qtd de Rodas são: " + this.qtdRodas +
                "\nA velocidade é: " + this.velocidade);
    }
}
