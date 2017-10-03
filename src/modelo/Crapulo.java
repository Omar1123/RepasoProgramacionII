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
public class Crapulo {
    
    private int numero;
    
    public Crapulo() {
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }        
    
    public int calcularCrapulo(int numero)
    {        
        int crapulo = 0;
        crapulo = numero;
        int aux;
        aux = 0;
        int res;
        res = 0;

        while(crapulo >= 10)
        {
            aux = crapulo;
            res = 0;
            while(aux > 0)
            {
                res += aux % 10;
                aux = aux / 10;
            }
            crapulo = res;
        }

        return crapulo;
    }
    
}
