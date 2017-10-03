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
public class NumeroAmigable {
    
    private int primerNumero;
    private int segundoNumero;

    public NumeroAmigable(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }
    
    public NumeroAmigable() {
        this.primerNumero = 0;
        this.segundoNumero = 0;
    }
    
    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    
    public boolean esParAmigable(int numero) {
        
        boolean comprobar;
        comprobar = true;
        int counter = 1;
        int tmpNumber = numero;
        
        while (tmpNumber / 10 >= 1)
        {
            counter ++;
            tmpNumber = tmpNumber / 10;
        }        

        for (int i = 1; i <= counter; i++)
        {
            if ((int)(numero / Math.pow(10, (counter - i))) % i == 0 && comprobar)
            {
                comprobar = true;
            }
            else
            {
                comprobar = false;
            }
        }
        
        return comprobar;
    }
 
    public boolean comprobarPar() {
        
        boolean foo;
        foo = false;
        
        boolean primerValor;
        primerValor = false;
        boolean segundoValor;
        segundoValor = false;
        
        primerValor = esParAmigable(primerNumero);
        segundoValor = esParAmigable(primerNumero);
        
        if(primerValor == true && segundoValor == true) {
            foo = true;
        } else {
            foo = false;
        }
        
        return foo;
    }
    
}
