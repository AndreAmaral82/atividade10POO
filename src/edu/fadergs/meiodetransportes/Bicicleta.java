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
public class Bicicleta extends Veiculos {
    private int numMarchas;
    private boolean bagageiro;
    
    public Bicicleta(){
        
    }
    
    public int getNumMarchas(){
        return numMarchas;
    }
    public void setNumMarchas(int numMarchas){
        this.numMarchas = numMarchas;
    }
    
    public boolean getBageiro(){
        return bagageiro;
    }
    public void setBagageiro(boolean bagageiro){
        this.bagageiro = bagageiro;
    }
    
    @Override
    public void imprimirInformacoes(){
       if(bagageiro == true){
            JOptionPane.showMessageDialog(null,
                "A marca é: " + this.marca +
                "\nO modelo é: " + this.modelo +
                "\nA qtd de Rodas são: " + this.qtdRodas +
                "\nO numero de Marchas são: " + this.numMarchas +
                "\nPossui bagageiro "
        );
       } else{
            JOptionPane.showMessageDialog(null,
                "A marca é: " + this.marca +
                "\nO modelo é: " + this.modelo +
                "\nA qtd de Rodas são: " + this.qtdRodas +
                "\nO numero de Marchas são: " + this.numMarchas +
                "\nNão possui bagageiro "
        );
       }
       
    }
}
