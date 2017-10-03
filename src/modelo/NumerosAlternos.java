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
public class NumerosAlternos {
    
    private int numeroAlterno;

    public NumerosAlternos(int numeroAlterno) {
        this.numeroAlterno = numeroAlterno;
    }    
    
    public NumerosAlternos() {
        this.numeroAlterno = 0;
    }
    
    public int getNumeroAlterno() {
        return numeroAlterno;
    }

    public void setNumeroAlterno(int numeroAlterno) {
        this.numeroAlterno = numeroAlterno;
    }
    
    public boolean esDivisible() {
        
        boolean foo;
        foo = false;
        
        if(numeroAlterno % 11 != 0){
            foo = true;
        } else {
            foo = false;
        }
        
        return foo;
    }
    
}
