/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import modelo.Estudiante;

/**
 *
 * @author jake
 */
public class ManejadorEstudiante {
    
    private List<Estudiante> listaEstudiantes;
    private Estudiante estudiante;
    
    public ManejadorEstudiante() {
        listaEstudiantes = new ArrayList<Estudiante>();
        estudiante = new Estudiante();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public void agregarEstudiantes() {
        
        for(int i=0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del estudiante " + i);
            estudiante.setNombre(scanner.next());

            System.out.println("Ingrese el nombre de la materia " + i);
            estudiante.setMateria(scanner.next());

            System.out.println("Ingrese la nota " + i);
            estudiante.setNota(scanner.nextDouble());      

            listaEstudiantes.add(estudiante);    
        }                
    }
    
    public void mostarListaOrdenada() {
        
        listaEstudiantes.sort(Comparator.comparing(Estudiante::getNota));
        
        for(Estudiante estudiante: listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre()); 
            System.out.println("Nota: " + estudiante.getMateria());             
        }
        
        System.out.println("El promedio es: " + promedioAlumnos());
    }
    
    public double promedioAlumnos() {
        
        double promedio;
        promedio = 0;
        
        for(Estudiante estudiante: listaEstudiantes) {
            promedio = promedio + estudiante.getNota();
        }
        
        promedio = promedio / listaEstudiantes.size();
        return promedio;
    }
}
