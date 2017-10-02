/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Produccion;

/**
 *
 * @author jake
 */
public class ManejadorProduccion {
 
    private List<Produccion> listaProduccion;
    private Produccion produccion;
    
    public ManejadorProduccion() {
        listaProduccion = new ArrayList<Produccion>();
        produccion = new Produccion();
    }

    public Produccion getProduccion() {
        return produccion;
    }

    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }
    
    public void agregarProductos() {
        for(int i=0; i < 3; i++) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre del producto " + i);
            produccion.setNombre(scanner.next());
            
            System.out.println("Ingrese el costo unitario del producto " + i);
            produccion.setCostoUnitario(scanner.nextDouble());
            
            System.out.println("Ingrese las unidades producidas " + i);
            produccion.setUnidadesProducidas(scanner.nextDouble());
            
            listaProduccion.add(produccion);    
        }
    }
    
    public void listaProductos() {
                
        for(Produccion produccion: listaProduccion) {
            System.out.println(produccion.getNombre());
            System.out.println(produccion.getCostoUnitario());
            System.out.println(produccion.getUnidadesProducidas());
            System.out.println(produccion.costosProduccion());
        }               
    }
}
