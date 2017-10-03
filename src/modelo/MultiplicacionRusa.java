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
public class MultiplicacionRusa {
    
    private int multiplicador;
    private int multiplicando;

    public MultiplicacionRusa(int multiplicador, int multiplicando) {
        this.multiplicador = multiplicador;
        this.multiplicando = multiplicando;
    }
    
    public MultiplicacionRusa() {
        this.multiplicador = 0;
        this.multiplicando = 0;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int Multiplicacion_Rusa(){
        
        int foo;
        foo = 0;
        
        while(multiplicador!=0){
            if(multiplicador % 2 != 0){
                foo = foo + multiplicando;
            }
            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;
        } 
        return foo;
    }
            
}
