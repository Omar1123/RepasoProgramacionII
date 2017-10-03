/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jake
 */
public class Alternante {
    
    private int alternante;

    public int getAlternante() {
        return alternante;
    }

    public void setAlternante(int alternante) {
        this.alternante = alternante;
    }

    public Alternante(int alternante) {
        this.alternante = alternante;
    }
    
    public Alternante() {
        this.alternante = 0;
    }
    
    public boolean esAlternante() {
        
        String temporal;
        boolean respuesta;
        respuesta = false;
        temporal = "";
        temporal = Integer.toString(alternante);
        temporal = temporal.substring(0,1);
        
        if(numeroPar(Integer.parseInt(temporal))) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public boolean numeroPar(int numero) {        
        if(numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
