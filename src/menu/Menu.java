/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import manejador.ManejadorEstudiante;
import modelo.Estudiante;
import modelo.Trabajador;

/**
 *
 * @author jake
 */
public class Menu {
        
    private int decision;
    private ManejadorEstudiante manejadorEstudiante;
    
    public Menu() {        
    
    }
        
    public void mostrarInformacion() {
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("23) Notas de N alumnos");
        decision = scanner.nextInt();
    }
    
    public void opcion(int decision) {
        if(decision == 23) {
            manejadorEstudiante.agregarEstudiantes();
            manejadorEstudiante.mostarListaOrdenada();            
        }
    }
    
}
