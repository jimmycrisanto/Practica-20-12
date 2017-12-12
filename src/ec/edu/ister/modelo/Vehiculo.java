/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 *
 * @author hp
 */
public abstract class Vehiculo {

    @Override
    public String toString() {
        return "todos son vehiculos"; //To change body of generated methods, choose Tools | Templates.
    }
    
    protected String matricula;
    protected String modelo;
    protected String potecniaCV;
    

    public Vehiculo(String matricula, String modelo, String potecniaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potecniaCV = potecniaCV;
    }
    public Vehiculo (){
    
    
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotecniaCV(String potecniaCV) {
        this.potecniaCV = potecniaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPotecniaCV() {
        return potecniaCV;
    }
    
    public abstract void consumo();
   

}
