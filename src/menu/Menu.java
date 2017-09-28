/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import modelo.Trabajador;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Trabajador trabajador;
    
    public Menu() {
        trabajador = new Trabajador();
    }
    
    public void recibirDatos() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador");
        trabajador.setNombre(scanner.next());
        
        System.out.println("Ingrese la cantidad de horas");
        trabajador.setHoras(scanner.nextDouble());
        
        System.out.println("Ingrese la tarifa a pagar");
        trabajador.setTarifa(scanner.nextDouble());                
    }
    
    public void mostrarInformacion() {
        recibirDatos();
        System.out.println("Se le debe pagar: " + trabajador.pagoTrabajador());
    }
}
