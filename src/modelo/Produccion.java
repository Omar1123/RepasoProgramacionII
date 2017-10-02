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
public class Produccion {
    
    private String nombre;
    private double costoUnitario;
    private double unidadesProducidas;        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getUnidadesProducidas() {
        return unidadesProducidas;
    }

    public void setUnidadesProducidas(double unidadesProducidas) {
        this.unidadesProducidas = unidadesProducidas;
    }
    
    public Produccion() {
        nombre = "";
        costoUnitario = 0;
        unidadesProducidas = 0;
    }
    
    public Produccion(String nombre, double costoUnitario, double unidadesProducidas) {
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.unidadesProducidas = unidadesProducidas;
    }
    
    public double costosProduccion() {
        
        double resultado;
        resultado = 0;
        
        resultado = costoUnitario * unidadesProducidas;
        return resultado;
    }
    
}
