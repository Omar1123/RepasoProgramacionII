/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import manejador.ManejadorEstudiante;
import manejador.ManejadorProduccion;
import manejador.ManejadorProductos;
import modelo.Crapulo;
import modelo.Estudiante;
import modelo.Trabajador;

/**
 *
 * @author jake
 */
public class Menu {
        
    private int decision;
    private ManejadorEstudiante manejadorEstudiante;
    private ManejadorProduccion manejadorProduccion;
    private ManejadorProductos manejadorProductos;
    
    private Crapulo crapulo;
    
    public Menu() {        
        manejadorEstudiante = new ManejadorEstudiante();
        manejadorProduccion = new ManejadorProduccion();
        manejadorProductos = new ManejadorProductos();
        crapulo = new Crapulo();
    }
        
    public void mostrarInformacion() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hoja 5");
        
        System.out.println("23) Notas de N alumnos");
        System.out.println("24) Polinomio");
        System.out.println("25) Costos de produccion");
        System.out.println("26) Gancia sobre productos");
        
        System.out.println("Hoja 6");
        System.out.println("27) 1: Crapulo de un numero");
        
        decision = scanner.nextInt();        
        opcion(decision);
    }
    
    public void opcion(int decision) {
        
        if(decision == 23) {            
            manejadorEstudiante.agregarEstudiantes();
            manejadorEstudiante.mostarListaOrdenada();            
        }
        
        if(decision == 25) {
            manejadorProduccion.agregarProductos();
            manejadorProduccion.listaProductos();
        }
        
        if(decision == 26) {
            manejadorProductos.agregarProductos();
            manejadorProductos.inversion();
            manejadorProductos.reporte();
        }
        
        if(decision == 27) {
            calcularCrapulo();     
        }
    }
    
    public void calcularCrapulo() {
        
        int numeroTemporal;
        numeroTemporal = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular");
        numeroTemporal = scanner.nextInt();
        
        System.out.println("El crapulo es: " + crapulo.calcularCrapulo(numeroTemporal));
    }
    
}
