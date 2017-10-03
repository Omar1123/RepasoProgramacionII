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
public class Exponente {
    
    private int numeroExponente;

    public int getNumeroExponente() {
        return numeroExponente;
    }

    public void setNumeroExponente(int numeroExponente) {
        this.numeroExponente = numeroExponente;
    }

    public Exponente(int numeroExponente) {
        this.numeroExponente = numeroExponente;
    }

    public Exponente() {
        this.numeroExponente = 0;
    }
    
    public static double power(double x, int n) {
        if(n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }

    }

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double myexp(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return (power(x, n) / factorial(n)) + myexp(x, n - 1);
        }
    }   
}
