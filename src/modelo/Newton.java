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
public class Newton {
    
    private int i=0;
    private double x[]=new double[50];
    private double e = 10;
    private double valorInicial;    
    
    public Newton(){          
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }        
       
    public double calcularRaiz()
    {
        i=0;
        x[0] = valorInicial;
        
        while(e > 0.0001)
        {
            x[i+1]=x[i]-(f(x[i])/fp(x[i]));
            e=Math.abs((x[i+1]-x[i])/x[i+1]);
            e=e*100;            
            i++;
        }
    
        return(x[i]);
    }
    
    public double fp(double x)
    {
   
       double fpx;
       fpx=-Math.exp(-x)-1;
       return fpx;
    }
   
    public double f(double x)
    {
       double fx;
       fx=Math.exp(-x)-x;
       return fx;     
    }
}
