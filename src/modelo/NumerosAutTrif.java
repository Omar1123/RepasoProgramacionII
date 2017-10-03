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
public class NumerosAutTrif {
    
    private int numeroAutomorfico;
    private int numeroTrimorficos;

    public NumerosAutTrif(int numero, int numero2) {
        this.numeroAutomorfico = numero;
        this.numeroTrimorficos = numero2;
    }
    
    public NumerosAutTrif() {
        this.numeroAutomorfico = 0;
        this.numeroTrimorficos = 0;
    }

    public int getNumeroAutomorfico() {
        return numeroAutomorfico;
    }

    public void setNumeroAutomorfico(int numeroAutomorfico) {
        this.numeroAutomorfico = numeroAutomorfico;
    }

    public int getNumeroTrimorficos() {
        return numeroTrimorficos;
    }

    public void setNumeroTrimorficos(int numeroTrimorficos) {
        this.numeroTrimorficos = numeroTrimorficos;
    }    
    
    public boolean numeroAutomórfico() {

        boolean automorfico;
        automorfico = false;
        
        int cuadrado = numeroAutomorfico * numeroAutomorfico;            
        
        if(numeroAutomorfico == (square%100) || numeroAutomorfico  == (square%10) ) 
            automorfico = true;
        else {
            automorfico = false;
        }
        
        return automorfico;        
    }
    
}
