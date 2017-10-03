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
public class Conjuntos {
    
    int[] conjuntoA = {1, 2, 4, 6};
    int[] conjuntoB = {1, 3, 5, 6};
    int[] resultado = {1, 3, 5, 6};
    
    public void convinarResultados() {
        for (int i = 0; i < conjuntoA.length; i++ ){
            resultado[i] = conjuntoA[i];            
            System.out.println(resultado[i]);
        }
        for (int i = 0; i < conjuntoB.length; i++ ){
            resultado[i] = conjuntoB[i];
            System.out.println(resultado[i]);
        }
    }
    
    public void aMenosB() {
        for (int i = 0; i < conjuntoA.length; i++ ){
            for (int a = 0; a < conjuntoB.length; a++ ){            
                resultado[i] = conjuntoA[i] - conjuntoB[a];
                System.out.println(resultado[i]);
            }        
        }        
    }
    
    public void bMenosA() {
        for (int i = 0; i < conjuntoA.length; i++ ){
            for (int a = 0; a < conjuntoB.length; a++ ){            
                resultado[i] = conjuntoA[i] + conjuntoB[a];
                System.out.println(resultado[i]);
            }        
        }        
    }
    
    public void inter() {
        for (int i = 0; i < conjuntoA.length; i++ ){
            for (int a = 0; a < conjuntoB.length; a++ ){                      
                if(conjuntoA[i] == conjuntoB[a]) {
                    resultado[i] = conjuntoA[i];
                    System.out.println(resultado[i]);
                }                                
            }        
        }        
    }
}
