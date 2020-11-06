/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meiosdetransportes;

import edu.fadergs.meiodetransportes.Automovel;
import edu.fadergs.meiodetransportes.Bicicleta;
import edu.fadergs.meiodetransportes.Carro;
import edu.fadergs.meiodetransportes.Moto;
import edu.fadergs.meiodetransportes.Veiculos;

/**
 *
 * @author claudio.silva
 */
public class MeiosdeTransportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Veiculos v1 = new Veiculos();
      v1.setmarca("Fiat");
      v1.setmodelo("UNO");
      v1.setqtdRodas(4);
      v1.acelerar(50);
      v1.frear(20);
      v1.imprimirInformacoes();
      
      Bicicleta b1 = new Bicicleta();
      b1.setmarca("Caloi");
      b1.setmodelo("Vulcan Aro 29");
      b1.setqtdRodas(2);
      b1.acelerar(40);
      b1.frear(5);
      b1.setNumMarchas(18);
      b1.setBagageiro(false);
      b1.imprimirInformacoes();
      
      Automovel a1 = new Automovel();
      a1.setmarca("Chevrolet");
      a1.setmodelo("Chevete");
      a1.setqtdRodas(4);
      a1.acelerar(70);
      a1.frear(25);
      a1.setPotenciaDoMotor(100);
      a1.imprimirInformacoes();
      
      Carro c1 = new Carro();
      c1.setmarca("Toyota");
      c1.setmodelo("Corola");
      c1.setqtdRodas(4);
      c1.acelerar(160);
      c1.frear(25);
      c1.setPotenciaDoMotor(160);
      c1.setQtdPortas(4);
      c1.imprimirInformacoes();


      Moto m1 = new Moto();
      m1.setmarca("Kawazaki");
      m1.setmodelo("Ninja");
      m1.setqtdRodas(2);
      m1.acelerar(190);
      m1.frear(15);
      m1.setPotenciaDoMotor(200);
      m1.setPartidaEletrica(false);
      m1.imprimirInformacoes();      
    }
      
}
