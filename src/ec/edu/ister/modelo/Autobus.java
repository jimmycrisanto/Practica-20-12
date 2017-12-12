/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import ec.edu.ister.vista.Registro;

/**
 *
 * @author hp
 */
public class Autobus extends Vehiculo{

    public Autobus() {
    }

    public Autobus(String numeroPlaza, String matricula, String modelo, String potecniaCV) {
        super(matricula, modelo, potecniaCV);
        this.numeroPlaza = numeroPlaza;
    }

    
   
    private String numeroPlaza;

    public String getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(String numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    

    @Override
    public void consumo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Registro obj2= new Registro();
        obj2.setVisible(true);
    }
    

}
