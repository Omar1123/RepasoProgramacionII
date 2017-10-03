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
public class Binario {
    
    private String binario;

    public Binario(String binario) {
        this.binario = binario;
    }    
    
    public Binario() {
        this.binario = "";
    }    
    
    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }
           
    public int calcularDecimal() {
        
        int foo;
        foo = 0;
        
        foo = Integer.parseInt(binario, 2);
        
        return foo;
    }    
}
