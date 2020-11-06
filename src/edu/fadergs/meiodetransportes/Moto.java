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
public class Moto extends Automovel {
    private boolean partidaEletrica;
    
    public Moto(){
    }
    
    public boolean getPartidaEletrica(){
        return partidaEletrica;
    }
    
    public void setPartidaEletrica(boolean partidaEletrica){
        this.partidaEletrica = partidaEletrica;
    }
    
    @Override
    public void imprimirInformacoes(){
        if(this.partidaEletrica == true){
        JOptionPane.showMessageDialog(null,
                "A marca é: " + this.marca +
                "\nO modelo é: " + this.modelo +
                "\nA qtd de Rodas são: " + this.qtdRodas +
                "\nA velocidade é: " + this.velocidade +
                "\nA potência do motor é :" + this.potenciaDoMotor +
                "\nPossui partida elétrica"
        );
    }else{
          JOptionPane.showMessageDialog(null,
                "A marca é: " + this.marca +
                "\nO modelo é: " + this.modelo +
                "\nA qtd de Rodas são: " + this.qtdRodas +
                "\nA velocidade é: " + this.velocidade +
                "\nA potência do motor é :" + this.potenciaDoMotor +
                "\nNão possui partida elétrica"
        );  
        }
}
}
