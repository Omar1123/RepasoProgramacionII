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
public class Trabajador {
    
    private String nombre;
    private double horas;
    private double tarifa;
    
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public Trabajador() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;        
    }
    
    public Trabajador(String nombre, double horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;        
    }    
    
    public double pagoTrabajador() {
        
        salario = 0;
        
        if(horas > 40) {            
            salario = horas * 1.5 * tarifa;            
        } else {
            salario = horas * tarifa;
        }        
        
        return salario;
    }
}
