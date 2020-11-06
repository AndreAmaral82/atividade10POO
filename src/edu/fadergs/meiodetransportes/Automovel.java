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
public class Automovel extends Veiculos {
    protected double potenciaDoMotor;
    
    public Automovel(){
     
    }
    
            
    public double getPotenciaDoMotor(){
        return potenciaDoMotor;
    }
    public void setPotenciaDoMotor(double potenciaDoMotor){
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    
  
    @Override
    public void imprimirInformacoes(){
        JOptionPane.showMessageDialog(null,
                "A marca é: " + this.marca +
                "\nO modelo é: " + this.modelo +
                "\nA qtd de Rodas são: " + this.qtdRodas +
                "\nA velocidade é: " + this.velocidade +
                "\nA potência do motor é :" + this.potenciaDoMotor);
    }
}
