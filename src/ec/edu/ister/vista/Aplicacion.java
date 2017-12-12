/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.Autobus;
import ec.edu.ister.modelo.Taxi;
import ec.edu.ister.modelo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Aplicacion {
    public static void main(String[] args) {
        Vehiculo obj1 = new Taxi();
        JOptionPane.showMessageDialog(null, obj1.toString());
        obj1.consumo();
        Vehiculo obj2= new Autobus();
        obj2.consumo();
        
    }

}
