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
public class Estudiante {
    
    private String nombre;
    private String materia;
    private double nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public Estudiante() {
        nombre = "";
        materia = "";
        nota = 0;
    }
    
    public Estudiante(String nombre, String materia, double nota) {
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }
    
}
