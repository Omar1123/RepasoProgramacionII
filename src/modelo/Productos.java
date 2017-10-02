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
public class Productos {

    private String nombre;
    private double costo;
    private double ventas;
    private double unidades;
    
    public Productos() {
        nombre = "";
        costo = 0;
        ventas = 0;
        unidades = 0;
    }    
    
    public double montoInvertido() {
        
        double invertido;
        invertido = 0;
        
        invertido = costo * ventas;
        return invertido;
    }
    
    public double gananciaPorProductos() {
     
        double ganancia;
        ganancia = 0;
        
        ganancia = ventas - costo;
        return ganancia;             
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getUnidades() {
        return unidades;
    }

    public void setUnidades(double unidades) {
        this.unidades = unidades;
    }           
}
